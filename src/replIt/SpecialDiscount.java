package replIt;

public class SpecialDiscount {
    public static void main(String[] args) {

    }
    public static String[] buyThreeDiscount(String[] order, boolean isMember) {
        //TODO
        String[] SPECIAL_ITEMS = {"Cactus", "Fork", "T Shirt"};
        int count = 0;
        if (!isMember) {
            for (int i = 0; i < order.length; i++) {
                for (int j = 0; j < SPECIAL_ITEMS.length; j++) {
                    if (order[i].equalsIgnoreCase(SPECIAL_ITEMS[j])) {
                        count++;
                    }
                    if (count > 2) {
                        String[] joined = new String[order.length + 1];
                        joined[order.length] = SPECIAL_ITEMS[j].toLowerCase();
                        for (int k = 0; k < order.length; k++) {
                            joined[k] = order[k];
                        }
                        return joined;
                    }
                }
            }
        } else if (isMember) {
            for (int i = 0; i < order.length; i++) {
                for (int j = 0; j < SPECIAL_ITEMS.length; j++) {
                    if (order[i].equalsIgnoreCase(SPECIAL_ITEMS[j])) {
                        count++;
                    }
                    if (count > 2) {
                        String[] joined = new String[order.length + 2];
                        joined[order.length] = SPECIAL_ITEMS[j].toLowerCase();
                        joined[order.length + 1] = SPECIAL_ITEMS[j].toLowerCase();
                        for (int k = 0; k < order.length; k++) {
                            joined[k] = order[k];
                        }
                        return joined;
                    }
                }
            }
        }
        return order;
    }
}