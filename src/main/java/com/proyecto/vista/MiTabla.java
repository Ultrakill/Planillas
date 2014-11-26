/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.vista;

import com.proyecto.beans.Contrato;
import com.proyecto.beans.PorcentajeAFP;
import com.proyecto.beans.RegimenPensionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Documentos
 */
public class MiTabla extends AbstractTableModel {

    List<Contrato> lista = new ArrayList<>();    
    private static final String[] columnas = {"% Fondo \n pensión", "% Seguro \n invalidéz", "% Comisión \n flujo", "% Comisión \n mixta", "S/. Tope \n prima"};

    public MiTabla() {
    }

    public MiTabla(List<Contrato> lista) {
        this.lista = lista;
    }

    @Override
    public String getColumnName(int col) {
        return columnas[col];
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                lista.get(rowIndex).getEmpleado().getNombre();
            case 1:
                
                lista.get(rowIndex).getPeriodoRegimenPensionList();
            case 2:
                lista.get(rowIndex).getComisionRemFlujo();
            case 3:
                lista.get(rowIndex).getComisionRemMixta();
            case 4:
                lista.get(rowIndex).getTopePrima();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        super.setValueAt(aValue, rowIndex, columnIndex);
//        switch (columnIndex) {
//            case 0:
//                lista.get(rowIndex).setFondoPension(Double.valueOf(aValue));
//                break;
//            case 1:
//                lista.get(rowIndex).setSeguroInvalidez(String.valueOf(aValue));
//                break;
//            case 2:
//                lista.get(rowIndex).setComisionRemFlujo(String.valueOf(aValue));
//                break;
//            case 3:
//                lista.get(rowIndex).setComisionRemMixta(String.valueOf(aValue));
//                break;
//            case 4:
//                lista.get(rowIndex).setTopePrima(String.valueOf(aValue));
//                break;
//        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return false;
        } else {
            return true;
        }
    }

//    public void addRow(PorcentajeAFP dates) {
//        lista.add(dates);
//        int row = lista.indexOf(dates);
//        for (int column = 0; column < dates.length; column++) {
//            fireTableCellUpdated(row, column);
//        }
//        fireTableRowsInserted(row, row);
//    }

}
