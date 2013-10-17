package metridoc.reports

class FundsController {

    static reportName = "Voyager Fund"

    static homePage = [
            title: "Voyager Fund",
            description: """
                Expenditure activity during specified ledger and by materials allocation or vendor.
            """
    ]

    def index() {
        redirect(url: "http://metridocstaff.library.upenn.edu/metridoc-penn-funds/")
    }
}
