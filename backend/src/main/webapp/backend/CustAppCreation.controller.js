sap.ui.controller("backend.CustAppCreation", {

/**
* Called when a controller is instantiated and its View controls (if available) are already created.
* Can be used to modify the View before it is displayed, to bind event handlers and do other one-time initialization.
* @memberOf backend.CustAppCreation
*/
	onInit: function() {
		
		//a JSON model that has key value pairs to bind it the elements of the View
		this.model  = new sap.ui.model.json.JSONModel(
				{
					"customer" : {
						"name" : "Neel"
					},
					"service" : {
						"title" : "Hair Cut",
						"description" : "",
						"duration" : 3600,
						"gender" : "Male"
					},		
					
					"start" : new Date(),
					"end" : new Date()					
				});
		
		//Set the model to the the View
		this.getView().setModel(this.model);

	},

/**
* Similar to onAfterRendering, but this hook is invoked before the controller's View is re-rendered
* (NOT before the first rendering! onInit() is used for that one!).
* @memberOf backend.CustAppCreation
*/
//	onBeforeRendering: function() {
//
//	},

/**
* Called when the View has been rendered (so its HTML is part of the document). Post-rendering manipulations of the HTML could be done here.
* This hook is the same one that SAPUI5 controls get after being rendered.
* @memberOf backend.CustAppCreation
*/
//	onAfterRendering: function() {
//
//	},

/**
* Called when the Controller is destroyed. Use this one to free resources and finalize activities.
* @memberOf backend.CustAppCreation
*/
//	onExit: function() {
//
//	}
	
	// Saves the Appointment
	onSubmit : function(oControlEvent){
		
//		this.model.setProperty("/start") = this.model.getProperty("/start").getTime();
				
		var dt = this.model.getProperty("/start").getTime();
		
		alert(dt);
		
		//Model For the Unix time stamp
		
		var oModel  = new sap.ui.model.json.JSONModel(
				{
					"customer" : {
						"name" : "Neel"
					},
					"service" : {
						"title" : "Hair Cut",
						"description" : "",
						"duration" : 3600,
						"gender" : "Male"
					},		
					
					"start" : new Number(),
					"end" : new Number()					
				});
		
		oModel.setProperty("/customer/name", this.model.getProperty("/customer/name"));
		oModel.setProperty("/service/title", this.model.getProperty("/service/title"));
		oModel.setProperty("/service/description", this.model.getProperty("/service/description"));
		oModel.setProperty("/service/duration", this.model.getProperty("/service/duration"));
		oModel.setProperty("/service/gender", this.model.getProperty("/service/gender"));
		oModel.setProperty("/start", this.model.getProperty("/start").getTime());
		oModel.setProperty("/end", this.model.getProperty("/start").getTime()+this.model.getProperty("/service/duration"));
		
		alert("fine");
				
		alert(oModel.getProperty("/start"));
		alert(oModel.getProperty("/end"));
		alert(oModel.getJSON());
		
		
		
		//update web.xml and add Cusomter Service to the service classes
		

		jQuery.ajax({
			url: "backend/customer/entries",
			data: oModel.getJSON(),
			type: "POST",
			contentType: "application/json"
			});	
		
		alert("submit done");
	}
	
	

});