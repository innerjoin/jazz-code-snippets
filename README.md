# jazz-code-snippets
A collection of useful code snippets and classes for interaction with RTC Jazz



#### HeaderMessageHandler usage

define([
	....
	"./HeaderMessageHandler",
  ....
], function( ... HeaderMessageHandler ... ) {
    .....
    // usage
		HeaderMessageHandler.addHeaderMessage("Hello, I am an info message", HeaderMessageHandler.INFO);
    .....
});
