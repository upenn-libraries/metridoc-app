package metridoc.reports

class EzBorrowController {

    static reportName = "EzBorrow Data Repository"

    static homePage = [
            title: "EzBorrow Data Repository",
            description: """
                ILL activity within the EZBorrow consortium
            """
    ]

    def index() {
        redirect(url: "https://metridoc.library.upenn.edu/metridoc-penn-borrow/EZBorrow")
    }
}
