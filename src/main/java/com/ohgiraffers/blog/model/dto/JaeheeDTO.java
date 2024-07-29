package com.ohgiraffers.blog.model.dto;

public class JaeheeDTO {
    private Long id; //primary key 값
    private String materialId; //자재 ID
    private String process; // 공정
    private String storage; // 창고
    private String materialName; //자재이름
    private Integer amount; //자재수량
    private String ingredient; // 자재재질
    private Integer weight; //자재중량
    private String incomming_date; //입고일자
    private String description; //비고


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

    public JaeheeDTO(Long id, String materialId, String process, String storage, String materialName, Integer amount, String ingredient, Integer weight, String incomming_date, String description) {
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

    @Override
    public String toString() {
        return "JaeheeDTO{" +
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

    public JaeheeDTO() {

    }

}
