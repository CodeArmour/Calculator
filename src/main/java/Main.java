import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.integration.MidPointIntegrator;
import org.apache.commons.math3.analysis.integration.UnivariateIntegrator;

public class Main {
    public static void main(String[] args) {

        UnivariateFunction function = v -> v + 1;
        UnivariateIntegrator integrator = new MidPointIntegrator();
        double result = integrator.integrate(1000, function, 0, 5);

        System.out.println("Numerical result of the integral: " + result);

    }
}
