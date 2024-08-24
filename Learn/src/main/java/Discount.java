public class Discount {

    public static void main(String[] args) {
        // Define the original prices and discount percentages
        String auctionDateHouse = "17th April";
        double[] housePrices = {20_000_000, 20_000_000, 20_000_000, 20_000_000}; // Prices of four houses
        double discountPercentageHouses = 0.30; // 30% discount
        
        String auctionDateLuxury = "22nd June";
        double[] apartmentPrices = {150_000_000, 150_000_000, 150_000_000}; // Prices of three luxury apartments
        double discountPercentageApartments = 0.15; // 15% discount
        
        String auctionDateCheap = "03rd August";
        double[] cheapHousePrices = {10_000_000, 10_000_000, 10_000_000}; // Prices of three cheap houses
        double discountPercentageCheapHouses = 0.40; // 40% discount

        // Calculate the total discount and losses
        double totalLoss = 0;
        double totalDiscountedSales = 0;

        System.out.printf("Date: %s\n", auctionDateHouse);
        // Calculate discounts for houses
        for (double price : housePrices) {
            double discount = price * discountPercentageHouses;
            double discountedPrice = price - discount;
            totalLoss += discount;
            totalDiscountedSales += discountedPrice;
            System.out.printf("House: Original Price = %.2f, Discounted Price = %.2f, Discount = %.2f\n", price, discountedPrice, discount);
        }
        
        System.out.printf("\nTotal Loss for the House = %.2f\n\nDate: %s\n", totalLoss, auctionDateLuxury);
        
        // Calculate discounts for luxury apartments
        for (double price : apartmentPrices) {
            double discount = price * discountPercentageApartments;
            double discountedPrice = price - discount;
            totalLoss += discount;
            totalDiscountedSales += discountedPrice;
            System.out.printf("Luxury Apartment: Original Price = %.2f, Discounted Price = %.2f, Discount = %.2f\n", price, discountedPrice, discount);
        }

        System.out.printf("\nTotal Loss for the Luxury Apartments = %.2f\n\nDate: %s\n", totalLoss, auctionDateCheap);
        
        // Calculate discounts for cheap houses
        for (double price : cheapHousePrices) {
            double discount = price * discountPercentageCheapHouses;
            double discountedPrice = price - discount;
            totalLoss += discount;
            totalDiscountedSales += discountedPrice;
            System.out.printf("Cheap House: Original Price = %.2f, Discounted Price = %.2f, Discount = %.2f\n", price, discountedPrice, discount);
        }

        System.out.printf("\nTotal Loss for the Cheap Houses = %.2f\n\n", totalLoss);
        
        // Output the total losses and discounted sales
        System.out.printf("\nTotal Loss for the Company = %.2f\n", totalLoss);
        System.out.printf("Total Discounted Sales = %.2f\n", totalDiscountedSales);
    }
}