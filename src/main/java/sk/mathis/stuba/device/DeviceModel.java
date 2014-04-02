/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sk.mathis.stuba.device;

/**
 *
 * @author Mathis
 */
public class DeviceModel {
private final String modelName;
private final Integer modelVendorId;
private final Integer modelId;

    public DeviceModel(String model, Integer vendorId, Integer modelId) {
        this.modelName = model;
        this.modelVendorId = vendorId;
        this.modelId = modelId;
    }



    public String getModelName() {
        return modelName;
    }

    public Integer getModelId() {
        return modelId;
    }

    public Integer getModelVendorId() {
        return modelVendorId;
    }
     
    
}
