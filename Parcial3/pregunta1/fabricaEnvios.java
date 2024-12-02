package pregunta1;

public class fabricaEnvios implements IfabricaEnvios {
    @Override
    public IenvioExpress envioExpress(){
        return new envioExpress();
    }

    public IenvioRegular envioRegular(){
        return new envioRegular();
    }

}
