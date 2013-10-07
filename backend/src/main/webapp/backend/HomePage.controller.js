sap.ui.controller("backend.HomePage", {

/**
* Called when a controller is instantiated and its View controls (if available) are already created.
* Can be used to modify the View before it is displayed, to bind event handlers and do other one-time initialization.
* @memberOf backend.HomePage
*/
	onInit: function() {
		
		//a JSON model that has key value pairs to bind it the elements of the View
		this.model  = new sap.ui.model.json.JSONModel(
				{
					custName : "",
					custService : "Hair Cut",
					custGender : "Male",
					custBarber : "Lena",
					custDesc : "",
					custDateTime : ""					
				});
		
		//Set the model to the the View
		this.getView().setModel(this.model, "uiCustAppCreation");

	},

/**
* Similar to onAfterRendering, but this hook is invoked before the controller's View is re-rendered
* (NOT before the first rendering! onInit() is used for that one!).
* @memberOf backend.HomePage
*/
//	onBeforeRendering: function() {
//
//	},

/**
* Called when the View has been rendered (so its HTML is part of the document). Post-rendering manipulations of the HTML could be done here.
* This hook is the same one that SAPUI5 controls get after being rendered.
* @memberOf backend.HomePage
*/
//	onAfterRendering: function() {
//
//	},

/**
* Called when the Controller is destroyed. Use this one to free resources and finalize activities.
* @memberOf backend.HomePage
*/
//	onExit: function() {
//
//	}
	
	//Opens Create Appointment Window	
	onCreateNew : function(oControlEvent){
		app.to("idCustAppCreation");
	}

});