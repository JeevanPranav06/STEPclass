package UC;

public class UC5 {
    public static void main(String[] args) {
        String[] OOPSBanner = {
                String.join(" ", "          ", "          ", "          ", "         "),
                String.join(" ", "  .####.  ", "  .####.  ", " ######:  ", "   :####:"),
                String.join(" ", "  ######  ", "  ######  ", " #######: ", "  :######"),
                String.join(" ", " :##  ##: ", " :##  ##: ", " ##   :## ", "  ##:  :#"),
                String.join(" ", " ##:  :## ", " ##:  :## ", " ##    ## ", "  ##     "),
                String.join(" ", " ##    ## ", " ##    ## ", " ##   :## ", "  ###:   "),
                String.join(" ", " ##    ## ", " ##    ## ", " #######: ", "  :#####:"),
                String.join(" ", " ##    ## ", " ##    ## ", " ######:  ", "   .#####"),
                String.join(" ", " ##    ## ", " ##    ## ", " ##       ", "      :##"),
                String.join(" ", " ##:  :## ", " ##:  :## ", " ##       ", "        #"),
                String.join(" ", " :##  ##: ", " :##  ##: ", " ##       ", "  #:.  :#"),
                String.join(" ", "  ######  ", "  ######  ", " ##       ", "  #######"),
                String.join(" ", "  .####.  ", "  .####.  ", " ##       ", "  .#####:"),
                String.join(" ", "          ", "          ", "          ", "         ")
        };

        for (int i = 0; i < OOPSBanner.length; i++) {
            System.out.println(OOPSBanner[i]);
        }

    }
}
