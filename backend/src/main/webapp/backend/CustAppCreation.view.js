sap.ui.jsview("backend.CustAppCreation", {

	/**
	 * Specifies the Controller belonging to this View. In the case
	 * that it is not implemented, or that "null" is returned, this View does
	 * not have a Controller.
	 * 
	 * @memberOf backend.CustAppCreation
	 */
	getControllerName : function() {
		return "backend.CustAppCreation";
	},

	/**
	 * Is initially called once after the Controller has been instantiated. It
	 * is the place where the UI is constructed. Since the Controller is given
	 * to this method, its event handlers can be attached right away.
	 * 
	 * @memberOf backend.CustAppCreation
	 */
	createContent : function(oController) {
		return new sap.m.Page({
			title : "Create New Appointment",
			enableScrolling : false,
			showNavButton: true,
			navButtonText: "Cancel",
			navButtonPress: function(){ 
		          app.back();            // when pressed, the back button should navigate back up to home page
		      },
			content : [ new sap.m.VBox({
				justifyContent : sap.m.FlexJustifyContent.Center,
				alignItems : sap.m.FlexAlignItems.Center,
				height : "100%",
				items : [
					
					new sap.m.Image({
						src: "logo-start.png",
						height: "150px",
						width: "150px"
					
					}),
					
					// Name Label
					new sap.m.Label({
						text : 'Name'
					}),
	
					//Name Input type : Text
					new sap.m.Input("inputName", {
	
						type : sap.m.InputType.Text,
						placeholder : 'Enter Name...',
						value: "{/customer/name}"
					}),
					
					// Service Label
					new sap.m.Label({
						text : 'Service',
					}),
	
					//Service Input type : Text
					new sap.m.Input("inputService", {
	
						type : sap.m.InputType.Text,
						placeholder : 'Enter Service...',
						value: "{/service/title}"
					}),
					
					// Gender Label
					new sap.m.Label({
						text : 'Gender'
					}),
	
					//Gender Input type : Text
					new sap.m.Input("inputGender", {
	
						type : sap.m.InputType.Text,
						placeholder : 'Enter Gender...',
						value: "{/service/gender}"
					}),
	
					// Barber Label
					new sap.m.Label({
						text : 'Barber'
					}),
	
					//Barber Input type : Text
					new sap.m.Input("inputBarber", {
	
						type : sap.m.InputType.Text,
						placeholder : 'Enter Barber Name...',
						
					}),
					
					// Description Label
					new sap.m.Label({
						text : 'Description'
					}),
	
									
					//Description Input type : Text
					new sap.m.TextArea("inputDesc", {
						placeholder : 'Enter Desc...',
						value: "{/service/description}"
					}),
					
					// Date and Time Label
					new sap.m.Label({
						text : 'Date and Time'
					}),
	
					//Date Time Input type : DateTime
					new sap.m.DateTimeInput("dtAppStart", {
	
						type : sap.m.DateTimeInputType.DateTime,
						placeholder : 'Enter Date and Time...',
						dateValue : "{/start}"
					}),
					
					// Confirm Button
					new sap.m.Button({
						text : "Confirm Appointment",
						icon : "sap-icon://accept",
//						tap : function() {
//							sap.m.URLHelper.triggerTel("06322 9559674");
//						}
						press : [oController.onSubmit, oController]				
					})

				]
			}) ]
		});
	}

});