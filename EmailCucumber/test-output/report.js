$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/sign.feature");
formatter.feature({
  "name": "EbaySearch",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "product search functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.user_launch_chrome_browser()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: failed to write prefs file\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027SWATHI\u0027, ip: \u0027192.168.43.39\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u002711.0.1\u0027\nDriver info: driver.version: ChromeDriver\nremote stacktrace: Backtrace:\n\tOrdinal0 [0x00329563+2725219]\n\tOrdinal0 [0x00228551+1672529]\n\tOrdinal0 [0x00110359+525145]\n\tOrdinal0 [0x0009FD43+64835]\n\tOrdinal0 [0x0009FEDC+65244]\n\tOrdinal0 [0x0009C9FB+51707]\n\tOrdinal0 [0x000BCC37+183351]\n\tOrdinal0 [0x000BCA3D+182845]\n\tOrdinal0 [0x000BA94B+174411]\n\tOrdinal0 [0x000A2528+75048]\n\tOrdinal0 [0x000A35A0+79264]\n\tOrdinal0 [0x000A3539+79161]\n\tOrdinal0 [0x0023D607+1758727]\n\tGetHandleVerifier [0x00446546+1050150]\n\tGetHandleVerifier [0x00446291+1049457]\n\tGetHandleVerifier [0x004510D7+1094071]\n\tGetHandleVerifier [0x00446B46+1051686]\n\tOrdinal0 [0x00235B06+1727238]\n\tOrdinal0 [0x0023EB7B+1764219]\n\tOrdinal0 [0x0023ECE3+1764579]\n\tOrdinal0 [0x00254C05+1854469]\n\tBaseThreadInitThunk [0x7689343D+18]\n\tRtlInitializeExceptionChain [0x77D39812+99]\n\tRtlInitializeExceptionChain [0x77D397E5+54]\n\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\r\n\tat java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:195)\r\n\tat java.base/java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\r\n\tat java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:127)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:502)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:488)\r\n\tat java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)\r\n\tat java.base/java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:150)\r\n\tat java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.base/java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:543)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat stepDefinitins.steps.user_launch_chrome_browser(steps.java:22)\r\n\tat ✽.user launch chrome browser(file:Features/sign.feature:3)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user open the url as \"http://ebay.in\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.user_open_the_url_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user select the dropdown as \"Cameras \u0026 Photo\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_select_the_dropdown_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter text fiels as \"Sony\"",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_enter_text_fiels_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.user_click_the_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "the page should be \"https://www.ebay.com/sch/i.html?_from\u003dR40\u0026_trksid\u003dm570.l1313\u0026_nkw\u003dsony\u0026_sacat\u003d625\"",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.the_page_should_be(String)"
});
formatter.result({
  "status": "skipped"
});
});