/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package int675practice.Week11;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Student Lab
 */
public class Product {
    private int productId;
    private String description;
    private double price;
    private boolean available;
    private int quantityOnHand;
    private String productType;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
    public static Product findById(int id){
        Product p = null;
        Connection conn = ConnectionBuilder.getConnection();
        try{
       PreparedStatement pstm = conn.prepareStatement(SQL_FIND_BY_ID);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                p = new Product();
                getProduct(rs, p);
            }
        }catch(SQLException ex){
            System.err.println(ex);
        }
        return p;
    }
    private static void getProduct(ResultSet rs,Product p)throws SQLException{
        p.setAvailable(rs.getBoolean("available"));
        p.setDescription(rs.getString("description"));
        p.setPrice(rs.getDouble("price"));
        p.setProductId(rs.getInt("product_id"));
        p.setProductType(rs.getString("product_type"));
        p.setQuantityOnHand(rs.getInt("quantity_on_hand"));
    }
    private static final String SQL_FIND_BY_ID = "SELECT p.product_id,p.purchase_cost + p.markup as price,p.quantity_on_hand,p.available,"+
            "p.description,pc.description as product_type"
            +" FROM product p,product_code pc WHERE p.product_code = pc.prod_code AND p.product_id = ?";
}
