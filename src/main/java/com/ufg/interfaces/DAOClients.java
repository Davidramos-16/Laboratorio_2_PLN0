/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ufg.interfaces;

import com.ufg.models.ClientsModel;
import java.util.List;

/**
 *
 * @author hecto
 */
public interface DAOClients {
    public void addClient(ClientsModel user) throws Exception;
    public void updateClient(ClientsModel user) throws Exception;
    public void deleteClient(ClientsModel user) throws Exception;
    public List<ClientsModel> getClients() throws Exception;
}
