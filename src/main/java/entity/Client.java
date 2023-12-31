package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "client")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Client {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private long id;

        @Column(name = "name")
        private String name;
}




/*
Client (клієнт) - клієнт компанії. Має наступні властивості:
id - ідентифікатор, первинний сурогатний ключ, автоінкрементне число.
name - ім'я, від 3 до 200 символів включно
 */
