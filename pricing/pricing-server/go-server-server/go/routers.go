package 

import (
	"net/http"
	"fmt"
	"github.com/gorilla/mux"
)

type Route struct {
	Name        string
	Method      string
	Pattern     string
	HandlerFunc http.HandlerFunc
}

type Routes []Route

func NewRouter() *mux.Router {
	router := mux.NewRouter().StrictSlash(true)
	for _, route := range routes {
		var handler http.Handler
		handler = route.HandlerFunc
		handler = Logger(handler, route.Name)

		router.
			Methods(route.Method).
			Path(route.Pattern).
			Name(route.Name).
			Handler(handler)
	}

	return router
}

func Index(w http.ResponseWriter, r *http.Request) {
	fmt.Fprintf(w, "Hello World!")
}

var routes = Routes{
	Route{
		"Index",
		"GET",
		"/v2/",
		Index,
	},

	Route{
		"CatalogProductTierPriceManagementV1AddPost",
		"POST",
		"/v2/v1/products/{sku}/group-prices/{customerGroupId}/tiers/{qty}/price/{price}",
		CatalogProductTierPriceManagementV1AddPost,
	},

	Route{
		"CatalogProductTierPriceManagementV1GetListGet",
		"GET",
		"/v2/v1/products/{sku}/group-prices/{customerGroupId}/tiers",
		CatalogProductTierPriceManagementV1GetListGet,
	},

	Route{
		"CatalogProductTierPriceManagementV1RemoveDelete",
		"DELETE",
		"/v2/v1/products/{sku}/group-prices/{customerGroupId}/tiers/{qty}",
		CatalogProductTierPriceManagementV1RemoveDelete,
	},

}