class NavigationTagLib {
    def topNav = {
        if (request) {
            out << request
        } else {
            out << 'navigation!'
        }
    }
}
