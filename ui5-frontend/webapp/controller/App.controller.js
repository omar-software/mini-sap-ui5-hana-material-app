sap.ui.define([
    "sap/ui/core/mvc/Controller",
    "sap/ui/model/json/JSONModel",
    "sap/m/MessageToast"
], function (Controller, JSONModel, MessageToast) {
    "use strict";

    return Controller.extend("mini.sap.material.controller.App", {

        onInit: function () {
            // Beim Start der App werden Materialien aus dem Spring Boot Backend geladen
            this.loadMaterials();
        },

        loadMaterials: function () {
            var oModel = new JSONModel();

            // OData-style REST API vom Spring Boot Backend
            oModel.loadData("http://localhost:8081/api/odata/materials");

            this.getView().setModel(oModel, "materials");
        },

        onRefresh: function () {
            this.loadMaterials();
            MessageToast.show("Materialdaten wurden neu geladen");
        },

        onShowLowStock: function () {
            var oModel = new JSONModel();

            // OData-style Endpoint fuer Low-Stock Materialien
            oModel.loadData("http://localhost:8081/api/odata/materials/low-stock");

            this.getView().setModel(oModel, "materials");
            MessageToast.show("Low-Stock Materialien geladen");
        },

        formatStatusText: function (iCurrentStock, iMinimumStock) {
            if (iCurrentStock <= iMinimumStock) {
                return "Low Stock";
            }

            return "OK";
        },

        formatStatusState: function (iCurrentStock, iMinimumStock) {
            if (iCurrentStock <= iMinimumStock) {
                return "Warning";
            }

            return "Success";
        }

    });
});
