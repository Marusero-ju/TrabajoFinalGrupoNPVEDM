package ar.edu.unju.fi;

import java.io.IOException;

@Component
public class AutenticacionSuccessHandler implements AuthenticationSuccesHandler{
	
	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

	@Override
	public void onAutenticationSuccess(HttpServletRequest request, HttpServiletResponse responce, Authentication authentication) throws IDException, ServletException{
		
		//TODO Auto-generated method stub
		boolean tipoConsultor = false;
		boolean tipoRegistrador = false;
		boolean tipoBasedeDatos = false;
		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
		for (GrantedAuthority grantedAuthority : authorities) {
			if (grantedAuthority.getAuthority().equals("Consultor")) {
				tipoConsultor = true;
				break;
			} else {
				if(grantedAuthority.getAuthority().equals("Registrador")) {
					tipoRegistrador = true;
					break;
				} else {
					tipoBasedeDatos = true;
					break;
				}
			}
     		}
		   if (tipoConsultor) {
			   redirectStrategy.sendRedirect(request, response, "/formulario");
		   }else {
			   if(tipoRegistrador) {
				   redirectStrategy.sendRedirect(request, response, "/estadios");   
			   }else {
				   if(tipoBasedeDatos) {
					   redirectStrategy.sendRedirect(request, response, "/equipos");
				   }else {
					   throw new IllegalStateException();
				   }
			   }
		       }
	}
}
