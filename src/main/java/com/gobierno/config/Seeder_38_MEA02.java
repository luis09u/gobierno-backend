package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(38) // Continuación de la evaluación corporativa en el dominio MEA
public class Seeder_38_MEA02 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_38_MEA02(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("MEA02")) {
            System.out.println("Iniciando carga de datos de control interno: MEA02...");
            cargarMEA02();
            System.out.println("MEA02 (Gestión del Sistema de Control Interno) cargado exitosamente.");
        }
    }

    private void cargarMEA02() {
        // ==========================================
        // INFORMACIÓN GENERAL (ENFOQUE DE AUDITORÍA PREVENTIVA)
        // ==========================================
        ProcesoCobit mea02 = new ProcesoCobit();
        mea02.setIdProceso("MEA02");
        mea02.setDominio("Monitorizar, Evaluar y Valorar");
        mea02.setAreaPrioritaria("Modelo Core de COBIT");
        mea02.setNombreProceso("Gestionar el sistema de control interno");
        mea02.setDescripcionProceso("Obtener una garantía razonable y documentada de que las políticas de seguridad y las restricciones operativas implementadas en la tecnología de la información están operando eficazmente, identificando las deficiencias organizacionales antes de que deriven en incidentes financieros severos.");
        mea02.setPropositoProceso("Asegurar a la junta directiva y a los accionistas que las barreras antifraude configuradas en los sistemas corporativos no han sido evadidas por los usuarios, manteniendo un entorno de control riguroso que proteja el patrimonio de la compañía frente a negligencias o actos malintencionados.");

        mea02.setMetasAlineamiento("AG02: Gestión integral y mitigación del riesgo empresarial relacionado con el uso de la tecnología.\nAG11: Cumplimiento riguroso de las directrices corporativas para el procesamiento y protección de la información.");
        mea02.setMetasEmpresariales("EG02: Optimización del entorno de riesgo y protección absoluta del patrimonio institucional.\nEG04: Alta calidad, oportunidad y fiabilidad en los reportes financieros entregados al mercado.");
        mea02.setMetricasModelo("Métrica 1: Número de vulnerabilidades o deficiencias de control interno detectadas durante auditorías preventivas que fueron corregidas antes de causar un impacto económico real.\nMétrica 2: Porcentaje de procesos tecnológicos críticos que fueron sometidos exitosamente a una autoevaluación formal de controles durante el último año fiscal.");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES DE REVISIÓN CONTINUA
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(mea02);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("MEA02.01");
        pract01.setNombrePractica("Monitorizar continuamente los controles internos");
        pract01.setDescripcionPractica("Observar de manera constante el comportamiento de las restricciones en los sistemas operativos para identificar cualquier intento de manipulación irregular de los datos comerciales.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Implementar herramientas de monitoreo perpetuo que analicen las bitácoras de los servidores centrales, levantando alarmas automáticas si detectan a un administrador alterando registros de ventas fuera de su horario laboral."); a1_1.setNivelCapacidadEsperado(4); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Realizar pruebas de intrusión controladas mensualmente sobre los cortafuegos de la empresa para comprobar si las barreras digitales soportan efectivamente los métodos de ataque más recientes."); a1_2.setNivelCapacidadEsperado(4); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("MEA02.03");
        pract02.setNombrePractica("Realizar autoevaluaciones de control gerencial");
        pract02.setDescripcionPractica("Exigir a los directores de cada departamento que revisen y certifiquen personalmente la efectividad de los controles informáticos aplicados dentro de sus respectivas áreas operativas.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Requerir que los gerentes de los concesionarios firmen declaraciones juradas trimestrales certificando que han revisado y depurado los accesos al sistema comercial de sus empleados a cargo."); a2_1.setNivelCapacidadEsperado(3); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Proporcionar cuestionarios de auditoría estandarizados para que las unidades de negocio evalúen su propio nivel de cumplimiento respecto a las normas corporativas de protección de datos personales."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("MEA02.04");
        pract03.setNombrePractica("Identificar y corregir las deficiencias operativas");
        pract03.setDescripcionPractica("Consolidar todas las vulnerabilidades descubiertas durante las revisiones para diseñar planes de remediación obligatorios e informar de inmediato al comité de riesgos.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Priorizar la atención de las fallas de control basándose estrictamente en el potencial daño financiero que estas podrían causar a la institución si fuesen explotadas por terceros."); a3_1.setNivelCapacidadEsperado(4); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Suspender la liberación de presupuesto para nuevos proyectos tecnológicos a aquellas gerencias operativas que mantengan deficiencias de seguridad graves sin resolver por más de sesenta días."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        mea02.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(mea02); raci1.setPracticaGestion("MEA02.01"); raci1.setRolOrganizacional("Comité Ejecutivo de Auditoría y Riesgos"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(mea02); raci2.setPracticaGestion("MEA02.03"); raci2.setRolOrganizacional("Directores Generales de las Unidades de Negocio"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(mea02); raci3.setPracticaGestion("MEA02.04"); raci3.setRolOrganizacional("Director Oficial de Cumplimiento Corporativo"); raci3.setNivelResponsabilidad("R");

        mea02.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(mea02); flujo1.setPracticaGestion("MEA02.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: DSS06.03"); flujo1.setDescripcion("Registros detallados sobre operaciones comerciales inusuales e intentos de evasión de las restricciones del sistema financiero.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(mea02); flujo2.setPracticaGestion("MEA02.04"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: APO12.04"); flujo2.setDescripcion("Informes consolidados de vulnerabilidades estructurales descubiertas exigiendo su inclusión inmediata en el mapa de riesgos de la empresa.");

        mea02.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(mea02); hab1.setNombreHabilidad("Auditoría Avanzada de Sistemas y Arquitectura de Controles Preventivos"); hab1.setDocumentacionRelacionada("Marco Integrado de Control Interno dictaminado por el Comité de Organizaciones Patrocinadoras de la Comisión Treadway"); hab1.setReferenciaEspecifica("De este marco de referencia mundial se rescata explícitamente el enfoque estructurado para evaluar el entorno de control organizacional, proporcionando una base legalmente avalada para demostrar ante entes reguladores que la compañía ejerce una debida diligencia sobre sus sistemas informáticos, protegiendo así a la junta directiva contra acusaciones de negligencia.");

        mea02.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(mea02); pol1.setTituloPolitica("Directiva de Revelación de Deficiencias y Protección al Denunciante Corporativo"); pol1.setDescripcionPolitica("Normativa rigurosa que obliga a todo colaborador a reportar de manera inmediata cualquier evasión de los controles tecnológicos que presencie, estableciendo canales de comunicación confidenciales y prohibiendo terminantemente cualquier tipo de represalia laboral contra quienes expongan fallas en la seguridad o en la contabilidad de la empresa."); pol1.setDocumentacionRelacionada("Estatuto Corporativo de Auditoría Interna y Transparencia"); pol1.setReferenciaEspecifica("Sección: Canales Seguros de Denuncia y Gestión de Evidencias");

        mea02.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(mea02); cult1.setElementoCultural("Cultura de Responsabilidad Compartida y Cero Tolerancia al Ocultamiento"); cult1.setDocumentacionRelacionada("Valores Institucionales de Integridad Operativa"); cult1.setReferenciaEspecifica("Fomentar activamente en la plana gerencial un entorno de trabajo donde admitir la ineficacia de un sistema de control interno se considere un acto valiente de lealtad hacia la compañía, erradicando el miedo paralizante que suele llevar a los directores a esconder los errores hasta que el problema estalla públicamente.");

        mea02.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(mea02); serv1.setNombreServicioHerramienta("Plataformas Tecnológicas de Gobierno Corporativo, Gestión de Riesgos y Cumplimiento Normativo");
        Servicio serv2 = new Servicio(); serv2.setProceso(mea02); serv2.setNombreServicioHerramienta("Sistemas Automatizados de Extracción y Análisis Forense de Bitácoras Operativas");

        mea02.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(mea02);
    }
}