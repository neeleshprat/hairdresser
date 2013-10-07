sap.ui.jsview("backend.HomePage", {

	/**
	 * Specifies the Controller belonging to this View. In the case
	 * that it is not implemented, or that "null" is returned, this View does
	 * not have a Controller.
	 * 
	 * @memberOf backend.HomePage
	 */
	getControllerName : function() {
		return "backend.HomePage";
	},

	/**
	 * Is initially called once after the Controller has been instantiated. It
	 * is the place where the UI is constructed. Since the Controller is given
	 * to this method, its event handlers can be attached right away.
	 * 
	 * @memberOf backend.HomePage
	 */
	createContent : function(oController) {
		return new sap.m.Page({
			title : "Friseur GREVING",
			enableScrolling : false,
				      
			content : [ new sap.m.VBox({
				justifyContent : sap.m.FlexJustifyContent.SpaceBetween,
				alignItems : sap.m.FlexAlignItems.Center,
				height : "70%",
				items : [ 
				    new sap.m.Image({
					src: "logo-start.png",
					height: "150px",
					width: "150px"
					}),
				         
					new sap.m.Button({
					text : "Create New Appointment",
					icon : "sap-icon://create",
					width : "250px",
					press : [ oController.onCreateNew, oController ]
					}),
				    
				    new sap.m.Button({
						text : "My Appointments",
						icon : "sap-icon://list",
						width : "250px",
						
					}),
					
					new sap.m.Button({
						text : "Business As Usual",
						icon : "sap-icon://toaster-down",
						width : "250px",
						
					})
				]
			}) ]
		});
	}

});