package com.nttdata.products.products.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import javax.print.attribute.IntegerSyntax;
import java.util.List;

@Entity
@Table(name = "client")
@Data
public class Client  {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)


        private Integer idClient;
        private String name;
        private Integer typeId;
        private String documentTypeId;
        private Integer document;

}
