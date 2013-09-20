sap.ui.jsview("backend.Placeholder", {

	/**
	 * Specifies the Controller belonging to this View. In the case that it is
	 * not implemented, or that "null" is returned, this View does not have a
	 * Controller.
	 * 
	 * @memberOf backend.Placeholder
	 */
	getControllerName : function() {
		return "backend.Placeholder";
	},

	/**
	 * Is initially called once after the Controller has been instantiated. It
	 * is the place where the UI is constructed. Since the Controller is given
	 * to this method, its event handlers can be attached right away.
	 * 
	 * @memberOf backend.Placeholder
	 */
	createContent : function(oController) {
		return new sap.m.Page({
			title : "Friseur GREVING",
			enableScrolling : false,
			content : [ new sap.m.VBox({
				justifyContent : sap.m.FlexJustifyContent.Center,
				alignItems : sap.m.FlexAlignItems.Center,
				height : "100%",
				items : [ new sap.m.Button({
					text : "Tel: 06322 / 95 59 674",
					icon : "sap-icon://phone",
					tap : function() {
						sap.m.URLHelper.triggerTel("06322 9559674");
					}
				}) ]
			}) ]
		});
	}

});