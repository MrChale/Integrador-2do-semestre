/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Ethereos
 */
public class Creedencial {
    
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private String edad;
    private String nacimiento;
    private String curp;
    private String calle;
    private String numero;
    private String colonia;
    private String estado;
    private String municipio;
    private String cp;
    private String sexo;
    
    public Creedencial(String nombre, String aPaterno, String aMaterno, String edad, String nacimiento, String curp, String calle, String numero, String colonia, String estado, String municipio, String cp, String sexo) {
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.edad = edad;
        this.nacimiento = nacimiento;
        this.curp = curp;
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.estado = estado;
        this.municipio = municipio;
        this.cp = cp;
        this.sexo = sexo;
    }
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }
    
    public String getEdad(){
        return edad;
    }
    
    public void setEdad(String edad){
        this.edad=edad;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

 
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getSexo() {
        return sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
   
    
    public String getNombreAjustado (){
        StringBuffer sb;
        
        if (getNombre() != null)
        {
            sb = new StringBuffer(getNombre());
        }else{
            sb = new StringBuffer();
        }
        
        sb.setLength(20);
        
        return sb.toString();
    }
    
    public String getaPaternoAjustado (){
        StringBuffer sb;
        
        if (getaPaterno() != null)
        {
            sb = new StringBuffer(getaPaterno());
        }else{
            sb = new StringBuffer();
        }
        
        sb.setLength(20);
        
        return sb.toString();
    }
    
    public String getaMaternoAjustado (){
        StringBuffer sb;
        
        if (getaMaterno() != null)
        {
            sb = new StringBuffer(getaMaterno());
        }else{
            sb = new StringBuffer();
        }
        
        sb.setLength(20);
        
        return sb.toString();
    }
    
    public String getEdadAjustado (){
        StringBuffer sb;
        
        if (getEdad() != null)
        {
            sb = new StringBuffer(getEdad());
        }else{
            sb = new StringBuffer();
        }
        
        sb.setLength(20);
        
        return sb.toString();
    }
    
    public String getNacimientoAjustado (){
        StringBuffer sb;
        
        if (getNacimiento() != null)
        {
            sb = new StringBuffer(getNacimiento());
        }else{
            sb = new StringBuffer();
        }
        
        sb.setLength(20);
        
        return sb.toString();
    }
    
    public String getCurpAjustado (){
        StringBuffer sb;
        
        if (getCurp() != null)
        {
            sb = new StringBuffer(getCurp());
        }else{
            sb = new StringBuffer();
        }
        
        sb.setLength(18);
        
        return sb.toString();
    }
    
    public String getCalleAjustado (){
        StringBuffer sb;
        
        if (getCalle() != null)
        {
            sb = new StringBuffer(getCalle());
        }else{
            sb = new StringBuffer();
        }
        
        sb.setLength(20);
        
        return sb.toString();
    }
    
    public String getNumeroAjustado (){
        StringBuffer sb;
        
        if (getNumero() != null)
        {
            sb = new StringBuffer(getNumero());
        }else{
            sb = new StringBuffer();
        }
        
        sb.setLength(20);
        
        return sb.toString();
    }
    public String getColoniaAjustado (){
        StringBuffer sb;
        
        if (getColonia() != null)
        {
            sb = new StringBuffer(getColonia());
        }else{
            sb = new StringBuffer();
        }
        
        sb.setLength(20);
        
        return sb.toString();
    }
    public String getEstadoAjustado (){
        StringBuffer sb;
        
        if (getEstado() != null)
        {
            sb = new StringBuffer(getEstado());
        }else{
            sb = new StringBuffer();
        }
        
        sb.setLength(20);
        
        return sb.toString();
    }
    public String getMunicipioAjustado (){
        StringBuffer sb;
        
        if (getMunicipio() != null)
        {
            sb = new StringBuffer(getMunicipio());
        }else{
            sb = new StringBuffer();
        }
        
        sb.setLength(20);
        
        return sb.toString();
    }
    public String getCpAjustado (){
        StringBuffer sb;
        
        if (getCp() != null)
        {
            sb = new StringBuffer(getCp());
        }else{
            sb = new StringBuffer();
        }
        
        sb.setLength(20);
        
        return sb.toString();
    }
    public String getSexoAjustado (){
        StringBuffer sb;
        
        if (getSexo() != null)
        {
            sb = new StringBuffer(getSexo());
        }else{
            sb = new StringBuffer();
        }
        
        sb.setLength(20);
        
        return sb.toString();
    }
}
