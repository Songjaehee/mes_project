package com.ohgiraffers.blog.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name="jaehee_blog1")
public class JaeheeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "materialId")
    private String materialId;

    @Column(name = "process")
    private String process;

    @Column(name = "storage")
    private String storage;

    @Column(name = "materialName")
    private String materialName;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "ingredient")
    private String ingredient;

    @Column(name = "weight")
    private Integer weight;

    @Column(name = "incomming_date")
    private String incomming_date;

    @Column(name = "description")
    private String description;

    public JaeheeEntity() { }

    public JaeheeEntity(Long id, String materialId, String process, String storage, String materialName, Integer amount, String ingredient, Integer weight, String incomming_date, String description) {
        this.id = id;
        this.materialId = materialId;
        this.process = process;
        this.storage = storage;
        this.materialName = materialName;
        this.amount = amount;
        this.ingredient = ingredient;
        this.weight = weight;
        this.incomming_date = incomming_date;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getIncomming_date() {
        return incomming_date;
    }

    public void setIncomming_date(String incomming_date) {
        this.incomming_date = incomming_date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "JaeheeEntity{" +
                "id=" + id +
                ", materialId='" + materialId + '\'' +
                ", process='" + process + '\'' +
                ", storage='" + storage + '\'' +
                ", materialName='" + materialName + '\'' +
                ", amount=" + amount +
                ", ingredient='" + ingredient + '\'' +
                ", weight=" + weight +
                ", incomming_date='" + incomming_date + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
