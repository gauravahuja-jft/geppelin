class MessageController {
    
    def index = { redirect(action:list,params:params) }

    // the delete, save and update actions only accept POST requests
    def allowedMethods = [delete:'POST', save:'POST', update:'POST']

    def list = {
        if(!params.max) params.max = 10
        [ messageList: Message.list( params ) ]
    }

    def show = {
        def message = Message.get( params.id )

        if(!message) {
            flash.message = "Message not found with id ${params.id}"
            redirect(action:list)
        }
        else { return [ message : message ] }
    }

    def delete = {
        def message = Message.get( params.id )
        if(message) {
            message.delete()
            flash.message = "Message ${params.id} deleted"
            redirect(action:list)
        }
        else {
            flash.message = "Message not found with id ${params.id}"
            redirect(action:list)
        }
    }

    def edit = {
        def message = Message.get( params.id )

        if(!message) {
            flash.message = "Message not found with id ${params.id}"
            redirect(action:list)
        }
        else {
            return [ message : message ]
        }
    }

    def update = {
        def message = Message.get( params.id )
        if(message) {
            message.properties = params
            if(!message.hasErrors() && message.save()) {
                flash.message = "Message ${params.id} updated"
                redirect(action:show,id:message.id)
            }
            else {
                render(view:'edit',model:[message:message])
            }
        }
        else {
            flash.message = "Message not found with id ${params.id}"
            redirect(action:edit,id:params.id)
        }
    }

    def create = {
        def message = new Message()
        message.properties = params
        return ['message':message]
    }

    def save = {
        def message = new Message(params)
        if(!message.hasErrors() && message.save()) {
            flash.message = "Message ${message.id} created"
            redirect(action:show,id:message.id)
        }
        else {
            render(view:'create',model:[message:message])
        }
    }
}
