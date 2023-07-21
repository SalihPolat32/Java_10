package com.salihpolat;

import com.salihpolat.dao.AgentDAO;
import com.salihpolat.dao.BuyerDAO;
import com.salihpolat.dao.PropertyDAO;
import com.salihpolat.dao.SellerDAO;
import com.salihpolat.model.Agent;
import com.salihpolat.model.Buyer;
import com.salihpolat.model.Property;
import com.salihpolat.model.Seller;

import java.math.BigDecimal;

public class AppMain {

    public static void main(String[] args) {

        AgentDAO agentDAO = new AgentDAO();

        BuyerDAO buyerDAO = new BuyerDAO();

        PropertyDAO propertyDAO = new PropertyDAO();

        SellerDAO sellerDAO = new SellerDAO();

        Agent agent1 = new Agent();
        agent1.setAgentName("Lolo Emlak");
        agent1.setPhone("123456789");
        agent1.setEmail("lolo123@gmail.com");
        agent1.setOfficeAddress("Kadıköy");

        agentDAO.saveOrUpdateAgent(agent1);

        Agent agent2 = new Agent();
        agent2.setAgentName("Abc Emlak");
        agent2.setPhone("987654321");
        agent2.setEmail("abc123@gmail.com");
        agent2.setOfficeAddress("Beşiktaş");

        agentDAO.saveOrUpdateAgent(agent2);

        Buyer buyer1 = new Buyer();
        buyer1.setFirstName("Salih Polat");
        buyer1.setLastName("DÖNMEZ");
        buyer1.setPhone("654987321");
        buyer1.setEmail("spd327@gmail.com");

        buyerDAO.saveOrUpdateBuyer(buyer1);

        Buyer buyer2 = new Buyer();
        buyer2.setFirstName("Yiğitcan");
        buyer2.setLastName("ABAY");
        buyer2.setPhone("321654987");
        buyer2.setEmail("yabay321@gmail.com");

        buyerDAO.saveOrUpdateBuyer(buyer2);

        Seller seller1 = new Seller();
        seller1.setFirstName("Orhun");
        seller1.setLastName("BAYINDIR");
        seller1.setPhone("987321654");
        seller1.setEmail("orh654@gmail.com");

        sellerDAO.saveOrUpdateSeller(seller1);

        Seller seller2 = new Seller();
        seller2.setFirstName("Osman Onur");
        seller2.setLastName("BAŞ");
        seller2.setPhone("123654987");
        seller2.setEmail("onur753@gmail.com");

        sellerDAO.saveOrUpdateSeller(seller2);

        Property property1 = new Property();
        property1.setTitle("Dublex");
        property1.setArea(300.55F);
        property1.setBedrooms(6);
        property1.setBathrooms(2);
        property1.setPrice(BigDecimal.valueOf(1_000_000.25));
        property1.setDescription("Doktordan Temiz");
        property1.setSeller(seller1);
        property1.getBuyers().add(buyer1);

        propertyDAO.saveOrUpdateProperty(property1);

        Property property2 = new Property();
        property2.setTitle("House");
        property2.setArea(200.11F);
        property2.setBedrooms(4);
        property2.setBathrooms(1);
        property2.setPrice(BigDecimal.valueOf(800_000.25));
        property2.setDescription("Memurdan Temiz");
        property1.setSeller(seller2);
        property2.getBuyers().add(buyer2);

        propertyDAO.saveOrUpdateProperty(property2);

        System.out.println("Agents");
        agentDAO.getAllAgents().forEach(System.out::println);

        System.out.println("\nBuyers");
        buyerDAO.getAllBuyers().forEach(System.out::println);

        System.out.println("\nProperties");
        propertyDAO.getAllProperties().forEach(System.out::println);

        System.out.println("\nSellers");
        sellerDAO.getAllSellers().forEach(System.out::println);
    }
}