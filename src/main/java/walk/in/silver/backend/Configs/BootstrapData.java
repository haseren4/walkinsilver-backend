package walk.in.silver.backend.Configs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

//    public final CustomerRepository customerRepository;
//    public final DivisionRepository divisionRepository;
    @Override
    public void run(String... args) {
        /*if(this.customerRepository.count() <6){
            Customer customer1 = new Customer();
            Customer customer2 = new Customer();
            Customer customer3 = new Customer();
            Customer customer4 = new Customer();
            Customer customer5 = new Customer();

            customer1.setAddress("Address 1");
            customer1.setDivision(divisionRepository.getReferenceById(3L));
            customer1.setFirstName("Bob");
            customer1.setLastName("Smith");
            customer1.setPostal_code("555555");

            customer2.setAddress("Address 2");
            customer2.setDivision(divisionRepository.getReferenceById(4L));
            customer2.setFirstName("John");
            customer2.setLastName("Adams");
            customer2.setPostal_code("44444");

            customer3.setAddress("Address 3");
            customer3.setDivision(divisionRepository.getReferenceById(5L));
            customer3.setFirstName("Tim");
            customer3.setLastName("Hall");
            customer3.setPostal_code("33333");

            customer4.setAddress("Address 4");
            customer4.setDivision(divisionRepository.getReferenceById(6L));
            customer4.setFirstName("Robert");
            customer4.setLastName("Walk");
            customer4.setPostal_code("22222");

            customer5.setAddress("Address 5");
            customer5.setDivision(divisionRepository.getReferenceById(7L));
            customer5.setFirstName("Bill");
            customer5.setLastName("Builder");
            customer5.setPostal_code("11111");

            customerRepository.save(customer1);
            customerRepository.save(customer2);
            customerRepository.save(customer3);
            customerRepository.save(customer4);
            customerRepository.save(customer5);
        }*/
    }
/*
    @Autowired
    public BootstrapData(CustomerRepository customerRepository,DivisionRepository divisionRepository){
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;

    }*/
}
