<html>
    <head>
        <title><g:layoutTitle default="Grails" /></title>
        <g:layoutHead />
        <g:javascript library="application" />
    </head>
    <body>
        <div id="wrapper">
            <div id="header">
                <h1>Geppelin</h1>
                <g:activeuser/>
                <g:form action="search">
                    <g:textField name="query" />
                    <g:actionSubmit value="Go!" />
                </g:form>
                <g:topNav/>
            </div>
            <div id="update-box">

            </div>
            <g:layoutBody />
        </div>
    </body>
</html>