package 

import (
	"net/http"
)

type CatalogProductTierPriceManagementV1 struct {

}

func CatalogProductTierPriceManagementV1AddPost(w http.ResponseWriter, r *http.Request) {
		w.Header().Set("Content-Type", "application/json; charset=UTF-8")
		w.WriteHeader(http.StatusOK)
}

func CatalogProductTierPriceManagementV1GetListGet(w http.ResponseWriter, r *http.Request) {
		w.Header().Set("Content-Type", "application/json; charset=UTF-8")
		w.WriteHeader(http.StatusOK)
}

func CatalogProductTierPriceManagementV1RemoveDelete(w http.ResponseWriter, r *http.Request) {
		w.Header().Set("Content-Type", "application/json; charset=UTF-8")
		w.WriteHeader(http.StatusOK)
}

