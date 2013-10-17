package metridoc.reports

class BorrowDirectController {

    static reportName = "Borrow Direct Data Repository"

    static homePage = [
            title: "Borrow Direct Data Repository",
            description: """
                ILL activity within the Borrow Direct consortium
            """
    ]

    def index() {
        redirect(url: "https://metridoc.library.upenn.edu/metridoc-penn-borrow/borrowDirect")
    }
}
