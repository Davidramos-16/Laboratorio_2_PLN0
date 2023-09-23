/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufg.impl;

import BD.Conexion;
import com.ufg.interfaces.DAOClients;
import com.ufg.models.ClientsModel;
import java.util.List;

/**
 *
 * @author hecto
 */
public class DAOClientsImpl extends Conexion implements DAOClients{

    @Override
    public void addClient(ClientsModel client) throws Exception {
       this.create(client.getNombre(), client.getApellido(), client.getEmail(), client.getTelefono(), client.getSaldo(), "1");
    }

    @Override
    public void updateClient(ClientsModel client) throws Exception {
       this.update(client.getId(), client.getNombre(), client.getApellido(), client.getEmail(), client.getTelefono(), client.getSaldo(), "1");
    }

    @Override
    public void deleteClient(ClientsModel client) throws Exception {
        this.delete(client.getId());
    }

    @Override
    public List<ClientsModel> getClients() throws Exception {
       List<ClientsModel> lista = this.select();
       return lista;
    }
    
}
