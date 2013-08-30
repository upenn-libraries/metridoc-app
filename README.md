This is a basic template / container for the view layer of metridoc.  All of the metridoc projects are grails plugins
and this application represents starting point to use these components.  This is meant to be a template for institutions to 
run any of the MetriDoc view components.  Although this readme should help you get started, more details about various 
MetriDoc software are available at the MetriDoc [wiki](https://github.com/metridoc/metridoc-wiki/wiki).  For the most part,
MetriDoc is an api / scripting tool to migrate data and the view part is an optional component to view / download that 
data.  If you want to use any of the view components that have been created for MetriDoc, this is the place to start.

#### Getting Started

This template represents a default grails application that only contains the `metridoc-core` plugin.  The template is 
actually a running application.  No MetriDoc applications are installed, so by itself it doesn't do
anything particularily intersting besides configuring security.  The following commands will get it working

```bash
git clone https://github.com/metridoc/metridoc-template-app.git
cd metridoc-template-app
./grailsw rA
```

You should see a simple home page listing installed applications (which there are none).  You can log in as admin with
user name `admin` and password `password` to see the admin components.

