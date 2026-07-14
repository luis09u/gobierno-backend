package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(36) // Cierre del dominio de entrega y soporte operativo (DSS)
public class Seeder_36_DSS06 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_36_DSS06(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("DSS06")) {
            System.out.println("Iniciando carga de datos de controles de negocio: DSS06...");
            cargarDSS06();
            System.out.println("DSS06 (Gestión de los Controles de Negocio) cargado exitosamente.");
        }
    }

    private void cargarDSS06() {
        // ==========================================
        // INFORMACIÓN GENERAL (ENFOQUE DE EXACTITUD Y ANTIFRAUDE)
        // ==========================================
        ProcesoCobit dss06 = new ProcesoCobit();
        dss06.setIdProceso("DSS06");
        dss06.setDominio("Entregar, Dar Servicio y Soporte");
        dss06.setAreaPrioritaria("Modelo Core de COBIT");
        dss06.setNombreProceso("Gestionar los controles de los procesos de negocio");
        dss06.setDescripcionProceso("Diseñar, establecer y monitorizar las reglas de validación integradas dentro de los sistemas informáticos para garantizar que todas las transacciones comerciales sean precisas, completas y debidamente autorizadas, previniendo cualquier tipo de fraude operativo.");
        dss06.setPropositoProceso("Asegurar que los procesos de facturación automática, la venta de servicios de movilidad conectada y la gestión de inventarios en los concesionarios operen con total exactitud matemática, implementando barreras sistémicas que impidan el registro de datos erróneos o la manipulación de las finanzas corporativas.");

        dss06.setMetasAlineamiento("AG03: Realización de beneficios a través del uso óptimo de la tecnología de la información.\nAG11: Cumplimiento riguroso de las políticas corporativas en la gestión y procesamiento de la información comercial.");
        dss06.setMetasEmpresariales("EG02: Gestión integral del riesgo empresarial para salvaguardar los activos de la compañía.\nEG04: Alta calidad, oportunidad y precisión en la información financiera generada.");
        dss06.setMetricasModelo("Métrica 1: Número de incidentes financieros originados por errores en las fórmulas de cálculo de los sistemas comerciales automatizados.\nMétrica 2: Porcentaje de transacciones de alto valor que requirieron la aprobación electrónica de dos gerentes distintos antes de su ejecución definitiva.");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES DE CONTROL TRANSACCIONAL
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(dss06);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("DSS06.01");
        pract01.setNombrePractica("Alinear las actividades de control con las operaciones comerciales");
        pract01.setDescripcionPractica("Traducir las reglas financieras de la organización en algoritmos de validación obligatorios dentro de las plataformas tecnológicas.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Programar puntos de validación en el sistema central de ventas, asegurando que ninguna solicitud de entrega de vehículo pueda ser procesada sin que el sistema confirme primero la recepción íntegra del pago bancario."); a1_1.setNivelCapacidadEsperado(3); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Implementar reglas de formato estricto en los formularios de registro de clientes para impedir que los asesores ingresen datos incompletos que corrompan las bases de datos de mercadeo."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("DSS06.02");
        pract02.setNombrePractica("Controlar el procesamiento y la exactitud de la información");
        pract02.setDescripcionPractica("Someter todas las operaciones digitales a verificaciones matemáticas cruzadas para identificar y retener cualquier cálculo anómalo antes de que afecte la contabilidad.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Diseñar rutinas de cuadre automático nocturno que comparen los totales de suscripciones de telemetría activadas contra el monto facturado en las cuentas corporativas, emitiendo alertas inmediatas si existe discrepancia."); a2_1.setNivelCapacidadEsperado(4); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Exigir que los sistemas informáticos rechacen automáticamente cualquier transacción que exceda los límites históricos de consumo del usuario, deteniendo la operación hasta contar con una verificación telefónica directa."); a2_2.setNivelCapacidadEsperado(4); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("DSS06.03");
        pract03.setNombrePractica("Gestionar la segregación de funciones corporativas");
        pract03.setDescripcionPractica("Estructurar los permisos informáticos para impedir que un solo empleado posea el poder absoluto sobre una transacción completa, mitigando las oportunidades de desfalco.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Configurar las plataformas de gestión de recursos para que el empleado que registra la compra de repuestos no tenga permisos técnicos para autorizar el desembolso del dinero hacia el proveedor."); a3_1.setNivelCapacidadEsperado(4); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Auditar semestralmente las matrices de acceso a los sistemas financieros para localizar y corregir conflictos de intereses, eliminando combinaciones de permisos que vulneren la transparencia operativa."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        dss06.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(dss06); raci1.setPracticaGestion("DSS06.01"); raci1.setRolOrganizacional("Director de Procesos Comerciales y Financieros"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(dss06); raci2.setPracticaGestion("DSS06.02"); raci2.setRolOrganizacional("Gerentes de Unidades Operativas"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(dss06); raci3.setPracticaGestion("DSS06.03"); raci3.setRolOrganizacional("Dirección de Contraloría Institucional"); raci3.setNivelResponsabilidad("R");

        dss06.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(dss06); flujo1.setPracticaGestion("DSS06.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: APO11.02"); flujo1.setDescripcion("Estándares de calidad de la información y requerimientos corporativos de exactitud transaccional.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(dss06); flujo2.setPracticaGestion("DSS06.03"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: MEA02.04"); flujo2.setDescripcion("Bitácoras de transacciones rechazadas y reportes sobre intentos de evasión de las políticas de segregación funcional.");

        dss06.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(dss06); hab1.setNombreHabilidad("Diseño de Controles Internos y Auditoría de Procesos de Negocio"); hab1.setDocumentacionRelacionada("Marco Integrado de Control Interno emitido por el Comité de Organizaciones Patrocinadoras de la Comisión Treadway"); hab1.setReferenciaEspecifica("De este prestigioso estándar financiero internacional se extrae la metodología exacta para diseñar controles preventivos y detectivos que aseguren la validez de las transacciones, garantizando de manera demostrable que ninguna falla en los sistemas genere pérdidas económicas para la compañía.");

        dss06.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(dss06); pol1.setTituloPolitica("Estatuto Institucional de Segregación de Funciones y Tolerancia Cero al Fraude"); pol1.setDescripcionPolitica("Normativa corporativa suprema que prohíbe la unificación de roles incompatibles bajo un mismo usuario informático. Esta regla determina que, si por motivos de fuerza mayor un operador requiere facultades para registrar y autorizar a la vez, el sistema bloqueará automáticamente sus operaciones hasta contar con una firma electrónica de exención aprobada por la contraloría general."); pol1.setDocumentacionRelacionada("Reglamento de Transparencia y Ética Comercial"); pol1.setReferenciaEspecifica("Sección: Prevención de Conflictos de Interés Sistémicos");

        dss06.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(dss06); cult1.setElementoCultural("Cultura de Precisión Transaccional y Transparencia Operativa"); cult1.setDocumentacionRelacionada("Valores Fundamentales de Responsabilidad Corporativa"); cult1.setReferenciaEspecifica("Inculcar en la mente de cada analista financiero y comercial que los controles informáticos restrictivos no son impedimentos burocráticos para obstaculizar las ventas, sino escudos vitales diseñados para proteger el prestigio de la organización y el patrimonio de los accionistas frente a errores humanos y fraudes premeditados.");

        dss06.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(dss06); serv1.setNombreServicioHerramienta("Plataformas Integrales de Planificación de Recursos Empresariales equipadas con Motores de Flujo de Aprobación Continua");
        Servicio serv2 = new Servicio(); serv2.setProceso(dss06); serv2.setNombreServicioHerramienta("Sistemas Analíticos para el Monitoreo y Conciliación Transaccional en Tiempo Real");

        dss06.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(dss06);
    }
}