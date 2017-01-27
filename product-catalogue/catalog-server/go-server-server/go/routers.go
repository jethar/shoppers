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
		"CatalogProductWebsiteLinkRepositoryV1DeleteByIdDelete",
		"DELETE",
		"/v2/v1/products/{sku}/websites/{websiteId}",
		CatalogProductWebsiteLinkRepositoryV1DeleteByIdDelete,
	},

	Route{
		"CatalogProductWebsiteLinkRepositoryV1SavePost",
		"POST",
		"/v2/v1/products/{sku}/websites",
		CatalogProductWebsiteLinkRepositoryV1SavePost,
	},

	Route{
		"CatalogProductWebsiteLinkRepositoryV1SavePut",
		"PUT",
		"/v2/v1/products/{sku}/websites",
		CatalogProductWebsiteLinkRepositoryV1SavePut,
	},

	Route{
		"AddProduct",
		"POST",
		"/v2/v1/products",
		AddProduct,
	},

	Route{
		"DeleteProduct",
		"DELETE",
		"/v2/v1/products/{productId}",
		DeleteProduct,
	},

	Route{
		"FindProductsByCategories",
		"GET",
		"/v2/v1/products/findByCategory",
		FindProductsByCategories,
	},

	Route{
		"GetProductById",
		"GET",
		"/v2/v1/products/{productId}",
		GetProductById,
	},

	Route{
		"UpdateProductWithForm",
		"POST",
		"/v2/v1/products/{productId}",
		UpdateProductWithForm,
	},

}