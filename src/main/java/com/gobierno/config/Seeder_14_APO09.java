package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(14) // Continuidad secuencial para el despliegue automático
public class Seeder_14_APO09 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_14_APO09(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("APO09")) {
            System.out.println("Iniciando carga de datos de acuerdos corporativos: APO09...");
            cargarAPO09();
            System.out.println("APO09 (Gestión de Acuerdos de Servicio) cargado exitosamente.");
        }
    }

    private void cargarAPO09() {
        // ==========================================
        // INFORMACIÓN GENERAL (ENFOQUE DE GOBIERNO Y GARANTÍAS)
        // ==========================================
        ProcesoCobit apo09 = new ProcesoCobit();
        apo09.setIdProceso("APO09");
        apo09.setDominio("Alinear, Planificar y Organizar");
        apo09.setAreaPrioritaria("Modelo Core de COBIT");
        apo09.setNombreProceso("Gestionar los acuerdos de servicio");
        apo09.setDescripcionProceso("Alinear los servicios tecnológicos con las necesidades de la empresa, formalizando acuerdos que especifiquen los niveles de calidad, disponibilidad y tiempos de respuesta esperados, tanto con proveedores externos como con áreas internas.");
        apo09.setPropositoProceso("Asegurar que las actualizaciones a distancia de los vehículos cuenten con garantías formales de continuidad operativa, minimizando el riesgo de interrupciones que dejen inoperativos los sistemas del cliente.");

        apo09.setMetasAlineamiento("AG05: Prestación de servicios de tecnología de acuerdo con los requisitos documentados del negocio.\nAG07: Seguridad e integridad permanente de la infraestructura de procesamiento de datos.");
        apo09.setMetasEmpresariales("EG01: Portafolio de productos comerciales competitivos y confiables.\nEG06: Continuidad y disponibilidad ininterrumpida de los servicios de negocio.");
        apo09.setMetricasModelo("Métrica 1: Porcentaje de acuerdos formales de servicio que cumplieron o superaron los niveles de calidad pactados durante el trimestre.\nMétrica 2: Frecuencia de incidentes operativos causados por incumplimiento de proveedores de telecomunicaciones.");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES DE CONTROL DE SERVICIOS
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(apo09);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("APO09.01");
        pract01.setNombrePractica("Identificar los servicios tecnológicos requeridos");
        pract01.setDescripcionPractica("Analizar las demandas de la empresa para catalogar todos los servicios digitales críticos que respaldan la operación del negocio automotriz.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Mantener un registro oficial y actualizado de todos los componentes tecnológicos necesarios para transmitir datos a los vehículos conectados."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Clasificar los servicios según su nivel de criticidad para la seguridad física de los conductores y pasajeros."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("APO09.02");
        pract02.setNombrePractica("Formalizar acuerdos de nivel de servicio");
        pract02.setDescripcionPractica("Negociar y firmar compromisos documentados que detallen exactamente qué nivel de disponibilidad tecnológica debe garantizarse en todo momento.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Establecer contratos que exijan a los proveedores de infraestructura de procesamiento externo una disponibilidad operativa del noventa y nueve coma nueve por ciento."); a2_1.setNivelCapacidadEsperado(3); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Definir penalidades económicas claras en los contratos comerciales en caso de que los proveedores de red celular interrumpan el flujo de datos hacia la flota automotriz."); a2_2.setNivelCapacidadEsperado(4); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("APO09.04");
        pract03.setNombrePractica("Monitorear e informar sobre el cumplimiento");
        pract03.setDescripcionPractica("Supervisar de forma constante si la calidad tecnológica entregada coincide con lo prometido en los documentos formales.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Generar informes mensuales para la gerencia operativa comparando el rendimiento real de los sistemas frente a los compromisos de servicio firmados."); a3_1.setNivelCapacidadEsperado(3); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Realizar reuniones de revisión de desempeño con los proveedores críticos para exigir mejoras ante cualquier caída temporal de los servidores."); a3_2.setNivelCapacidadEsperado(4); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        apo09.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(apo09); raci1.setPracticaGestion("APO09.01"); raci1.setRolOrganizacional("Director de Operaciones (COO)"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(apo09); raci2.setPracticaGestion("APO09.02"); raci2.setRolOrganizacional("Director Jurídico y Cumplimiento"); raci2.setNivelResponsabilidad("C");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(apo09); raci3.setPracticaGestion("APO09.04"); raci3.setRolOrganizacional("Gestor de Niveles de Servicio y Proveedores"); raci3.setNivelResponsabilidad("R");

        apo09.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(apo09); flujo1.setPracticaGestion("APO09.02"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: Áreas Comerciales y Legales"); flujo1.setDescripcion("Requerimientos formales de disponibilidad para el correcto funcionamiento de los servicios vendidos al cliente.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(apo09); flujo2.setPracticaGestion("APO09.04"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: MEA01.03"); flujo2.setDescripcion("Cuadros de mando y reportes de desviaciones sobre el cumplimiento de los contratos tecnológicos.");

        apo09.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(apo09); hab1.setNombreHabilidad("Gestión de Contratos y Niveles de Servicio"); hab1.setDocumentacionRelacionada("Marcos de Gestión de Servicios Corporativos"); hab1.setReferenciaEspecifica("Capacidad de redacción, evaluación y auditoría de compromisos operativos en entornos tecnológicos de alta disponibilidad.");

        apo09.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS Y DIRECTRICES INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(apo09); pol1.setTituloPolitica("Política Institucional de Garantía de Servicios Digitales"); pol1.setDescripcionPolitica("Normativa que prohíbe el lanzamiento de cualquier funcionalidad tecnológica dirigida a los usuarios finales si no cuenta previamente con un documento firmado que asegure el soporte técnico, los tiempos de respuesta ante fallos y los mecanismos de compensación."); pol1.setDocumentacionRelacionada("Manual de Gestión de Operaciones y Continuidad"); pol1.setReferenciaEspecifica("Sección: Acuerdos Formales de Integridad Tecnológica");

        apo09.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE RESPONSABILIDAD
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(apo09); cult1.setElementoCultural("Cultura de Excelencia y Compromiso Operativo"); cult1.setDocumentacionRelacionada("Directrices de Calidad Institucional"); cult1.setReferenciaEspecifica("Promover una mentalidad donde el cumplimiento de los acuerdos firmados sea un asunto de honor y reputación de la empresa, evitando comprometer fechas de entrega o capacidades técnicas irreales.");

        apo09.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(apo09); serv1.setNombreServicioHerramienta("Sistemas Centralizados de Gestión de Servicios Institucionales (Mesas de Ayuda y Soporte)");
        Servicio serv2 = new Servicio(); serv2.setProceso(apo09); serv2.setNombreServicioHerramienta("Plataformas Automáticas de Monitoreo de Disponibilidad de Redes y Servidores Externos");

        apo09.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(apo09);
    }
}