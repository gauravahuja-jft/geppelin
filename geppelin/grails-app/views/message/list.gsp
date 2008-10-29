

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="layout" content="geppelin" />
        <title>Message List</title>
    </head>
    <body>
        <div class="nav">
            <span class="menuButton"><a class="home" href="${createLinkTo(dir:'')}">Home</a></span>
            <span class="menuButton"><g:link class="create" action="create">New Message</g:link></span>
        </div>
        <div class="body">
            <h1>Message List</h1>
            <g:if test="${flash.message}">
            <div class="message">${flash.message}</div>
            </g:if>
            <div class="list">
                <table>
                    <thead>
                        <tr>
                        
                   	        <g:sortableColumn property="id" title="Id" />
                        
                   	        <g:sortableColumn property="createdOn" title="Created On" />
                        
                   	        <g:sortableColumn property="text" title="Text" />
                        
                   	        <th>User</th>
                   	    
                        </tr>
                    </thead>
                    <tbody>
                    <g:each in="${messageList}" status="i" var="message">
                        <tr class="${(i % 2) == 0 ? 'odd' : 'even'}">
                        
                            <td><g:link action="show" id="${message.id}">${fieldValue(bean:message, field:'id')}</g:link></td>
                        
                            <td>${fieldValue(bean:message, field:'createdOn')}</td>
                        
                            <td>${fieldValue(bean:message, field:'text')}</td>
                        
                            <td>${fieldValue(bean:message, field:'user')}</td>
                        
                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>
            <div class="paginateButtons">
                <g:paginate total="${Message.count()}" />
            </div>
        </div>
    </body>
</html>
