// Problem Statement
// Design an Online Shopping System using Java OOP principles
// Create the following classes:
// Person (Abstract Class)
// id
// name
// Email

// Customer extends Person
// city
// primeMember

// Seller extends Person
// companyName
// sellerRating
// Product
// productid
// productName
// category
// price
// rating
// inStock
// Seller seller

// Requirements:
// Use Encapsulation
// Use Inheritance
// Use Constructors
// Override toString()
// Store all objects using ArrayList
// Create
// 4 Customers
// 3 Sellers
// 8 Products

// Using Stream API, perform the following operations
// Display all product names
// Display all products that are in stock
// Find products costing more than 1000
// Find all Prime customers
// Find sellers with rating above 4.5

// Sort products by price
// Sort sellers by rating (descending)
// Display all unique product categories.

// Count products that are in stock
// Find the costliest and cheapest product
// Calculate the average product price
// Calculate the total value of all products using reduce()
// Check whether all products are in stock

// Check whether any customer belongs to Delhi
// Find the first Prime customer
// Display the top 3 highest-rated products
// Group products by category
// Group products by seller
// Partition products into In Stock and Out of Stock
// Create a Map<Integer, Product> using Product ID as the key
// Print all customer names separated by commas


import java.util.*;

class Person {
    private int id;
    private String name;
    private String email;

    public Person(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Person{"+"id=" + id+", name='" + name + '\'' +", email='" + email + '\''+'}';
    }
}

class Customer extends Person{

}


public class OnlineShoppingSystem {
    public static void main(String[] args) {
        // Create Customers
        Customer customer1 = new Customer(1, "Alice", "alice@example.com", "Delhi", true);
        Customer customer2 = new Customer(2, "Bob", "bob@example.com", "Mumbai", false);
        Customer customer3 = new Customer(3, "Charlie", "charlie@example.com", "Delhi", true);
        Customer customer4 = new Customer(4, "David", "david@example.com", "Chennai", false);

        // Create Sellers
        Seller seller1 = new Seller(1, "Eve", "eve@example.com", "Tech Solutions", 4.8);
        Seller seller2 = new Seller(2, "Frank", "frank@example.com", "Fashion Hub", 4.6);
        Seller seller3 = new Seller(3, "Grace", "grace@example.com", "Home Essentials", 4.9);

        // Create Products
        Product product1 = new Product(1, "Laptop", "Electronics", 100000, 4.5, true, seller1);
        Product product2 = new Product(2, "Smartphone", "Electronics", 50000, 4.3, true, seller1);
        Product product3 = new Product(3, "T-Shirt", "Clothing", 500, 4.0, false, seller2);
        Product product4 = new Product(4, "Jeans", "Clothing", 1500, 4.2, true, seller2);
        Product product5 = new Product(5, "Bookshelf", "Furniture", 3000, 4.7, true, seller3);
        Product product6 = new Product(6, "Desk Lamp", "Furniture", 1000, 4.1, false, seller3);
        Product product7 = new Product(7, "Headphones", "Electronics", 2000, 4.6, true, seller1);
        Product product8 = new Product(8, "Sneakers", "Footwear", 2500, 4.4, true, seller2);

        // Store all objects in ArrayList
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);

        ArrayList<Seller> sellers = new ArrayList<>();
        sellers.add(seller1);
        sellers.add(seller2);
        sellers.add(seller3);

        ArrayList<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        products.add(product5);
        products.add(product6);
        products.add(product7);
        products.add(product8);

    }
}