# GWT2.7MavenEclipse


Running via Maven in GWT Dev Mode
---------------------------------

In order to run the example via Maven in GWT Dev Mode, you need to do:

1. Start the web application in Tomcat 7 via Maven
2. Start GWT Dev Mode via Maven
3. Run the application in your browser

To accomplish the first point, issue the following Maven command on a shell:

    mvn clean install
    mvn tomcat7:run-war-only

Your application is now deployed at http://127.0.0.1:8082/parent/.

Now, you need to start GWT Dev Mode. Open a second shell and execute:

    mvn gwt:run -pl web

On success, the GWT Dev Mode window opens. Click *Launch Default Browser* to open it in GWT Dev Mode.

You can now make changes to your client Java code. Changes become immediately available as soon as you reloaded your page in the browser.
