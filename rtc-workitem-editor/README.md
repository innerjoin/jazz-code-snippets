# RTC Work Item Editor Code Snippets
A collection of code snippets specifiically for the standard Work Item Editor in RTC.

## HeaderMessageHandler.js
Add status message to work item (INFO, WARNING or ERROR).

```javascript
define([
	....
	"./HeaderMessageHandler",
	....
], function( ... HeaderMessageHandler ... ) {
	.....
	HeaderMessageHandler.addHeaderMessage("Hello, I am an info message", HeaderMessageHandler.INFO);
	....
});
```
