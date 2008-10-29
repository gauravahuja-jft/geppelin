abstract class SecureController {
    def beforeInterceptor = [action: this.&auth,
        only: ['delete', 'save', 'update', 'list', 'edit', 'new']]

    private auth() {
        if (!session.user) {
            redirect(controller:'user', action: 'login')
            return false
        }
    }
}
