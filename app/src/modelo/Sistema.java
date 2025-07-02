package modelo;

import java.util.List;
import java.util.ArrayList;

public class Sistema {
private List<Usuario> usuarios;
private List<Tarjeta> tarjetas;


public Sistema() {
	super();
	this.usuarios = new ArrayList<Usuario>();
	this.tarjetas = new ArrayList<Tarjeta>();
}


public List<Usuario> getUsuarios() {
	return usuarios;
}


public void setUsuarios(List<Usuario> usuarios) {
	this.usuarios = usuarios;
}


public List<Tarjeta> getTarjetas() {
	return tarjetas;
}


public void setTarjetas(List<Tarjeta> tarjetas) {
	this.tarjetas = tarjetas;
}


@Override
public String toString() {
	return "Sistema [usuarios=" + usuarios + ", tarjetas=" + tarjetas + "]";
}



public Usuario traerUsuario(long dni) {
	Usuario u = null;
	int i = 0;
	
	while(u ==null && i < usuarios.size()) {
		if(usuarios.get(i).getDni()==dni) {
			u=usuarios.get(i);
		}
	i++;
	}
	
	return u;
}

public boolean agregarUsuario(long dni,String apellido,String nombre) throws Exception {
 if(this.traerUsuario(dni)!=null) {
	 throw new Exception("ERROR: El usuario ya existe");
 }
 
 int id;
 if(usuarios.isEmpty()) {
	 id=1;
 }else {
	 id=usuarios.get(usuarios.size()-1).getIdUsuario()+1;
 }

 Usuario usu = new Usuario(id,dni,apellido,nombre);
 return usuarios.add(usu);
	
}

public boolean agregarTarjeta(String codigo,Usuario usuario) throws Exception {
			//VALIDACION DE CODIGO EN EL SET DE TARJETA
	 Tarjeta tar = new Tarjeta(codigo,usuario,0);
	 return tarjetas.add(tar);
		
	}

public Tarjeta traerTarjeta(String codigo) {
	Tarjeta t = null;
	int i = 0;
	
	while(t ==null && i < tarjetas.size()) {
		if(tarjetas.get(i).getCodigo().equalsIgnoreCase(codigo)) {
			t=tarjetas.get(i);
		}
	i++;
	}
	
	return t;
}

public List<Usuario> traerUsuariosSinSaldo(){
	List<Usuario> usuariosSinSaldo= new ArrayList<>();
	
	for(Tarjeta tarjeta : tarjetas) {
		if(tarjeta.getSaldoActual()==0) {
			usuariosSinSaldo.add(tarjeta.getUsuario());
		}
		
	}
	return usuariosSinSaldo;
	
}


}
