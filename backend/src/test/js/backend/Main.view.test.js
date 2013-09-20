describe("the view", function() {
	var sut = sap.ui.jsview("backend.Placeholder");

	it("should be associated with a controller named 'backend.Placeholder'",
			function() {
				expect(sut.getControllerName()).toBe("backend.Placeholder");
			});
});