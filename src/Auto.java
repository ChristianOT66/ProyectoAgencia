public abstract class Auto {
   protected String tipoCombustuble;
   protected String color;
   protected String tipoSuspension;
   protected int cantPuertas;
   
   public abstract void setTipoCombustuble(String tipoCombustuble);
   public abstract String getTipoCombustuble();
   public abstract void setColor(String color);
   public abstract String getColor();
   public abstract void setTipoSuspension(String tipoSuspension);
   public abstract String getTipoSuspension();
   public abstract void setCantPuertas(int cantPuertas);
   public abstract int getCantPuertas();
   
}