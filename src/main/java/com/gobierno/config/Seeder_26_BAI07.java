package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(26) // Continuidad en la arquitectura del dominio BAI
public class Seeder_26_BAI07 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_26_BAI07(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("BAI07")) {
            System.out.println("Iniciando carga de datos de aceptación y transición: BAI07...");
            cargarBAI07();
            System.out.println("BAI07 (Gestión de la Aceptación y Transición) cargado exitosamente.");
        }
    }

    private void cargarBAI07() {
        // ==========================================
        // INFORMACIÓN GENERAL (ENFOQUE DE VALIDACIÓN Y GARANTÍA)
        // ==========================================
        ProcesoCobit bai07 = new ProcesoCobit();
        bai07.setIdProceso("BAI07");
        bai07.setDominio("Construir, Adquirir e Implementar");
        bai07.setAreaPrioritaria("Modelo Core de COBIT");
        bai07.setNombreProceso("Gestionar la aceptación y la transición de los cambios de tecnología");
        bai07.setDescripcionProceso("Aceptar formalmente y poner en funcionamiento las nuevas soluciones tecnológicas, garantizando que el entorno operativo esté completamente preparado y que los usuarios finales validen el comportamiento del sistema de acuerdo con sus necesidades antes del despliegue definitivo.");
        bai07.setPropositoProceso("Garantizar que la implementación de nuevas funcionalidades en los automóviles conectados no se realice de manera unilateral por el equipo de ingeniería, sino que cuente con la validación explícita y formal de las áreas comerciales, mitigando el riesgo de rechazo operativo por parte del consumidor final.");

        bai07.setMetasAlineamiento("AG08: Habilitación y respaldo absoluto a los procesos comerciales mediante herramientas digitales.\nAG09: Entrega de programas que proporcionen beneficios reales a tiempo y cumpliendo estrictamente con los requisitos.");
        bai07.setMetasEmpresariales("EG01: Portafolio de productos comerciales competitivos y alineados con el mercado.\nEG06: Continuidad operativa y disponibilidad ininterrumpida de los servicios de negocio.");
        bai07.setMetricasModelo("Métrica 1: Porcentaje de actualizaciones de software vehicular que requirieron soporte técnico de emergencia durante los primeros treinta días de operación comercial.\nMétrica 2: Índice de satisfacción de los líderes operativos respecto a la calidad funcional de las herramientas tecnológicas entregadas.");

        // ==========================================
        // COMPONENTE A: PRÁCTICAS Y ACTIVIDADES DE TRANSICIÓN
        // ==========================================
        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(bai07);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("BAI07.01");
        pract01.setNombrePractica("Establecer un plan de implementación y transición");
        pract01.setDescripcionPractica("Estructurar cronogramas precisos que dictaminen cómo se trasladará el nuevo sistema desde los laboratorios de prueba hacia el entorno real sin afectar las operaciones en curso.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Diseñar estrategias de despliegue gradual, lo cual implica enviar la actualización tecnológica únicamente al cinco por ciento de la flota vehicular inicial para monitorear su estabilidad antes de ejecutar una transmisión global."); a1_1.setNivelCapacidadEsperado(3); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Desarrollar y documentar procedimientos técnicos de reversión inmediata que permitan restaurar la versión anterior del sistema operativo automotriz en caso de que la nueva actualización presente defectos críticos imprevistos."); a1_2.setNivelCapacidadEsperado(4); a1_2.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("BAI07.02");
        pract02.setNombrePractica("Planificar las pruebas de validación comercial");
        pract02.setDescripcionPractica("Preparar entornos informáticos seguros que simulen fielmente la realidad del mercado para que los representantes comerciales evalúen el producto de forma controlada.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Habilitar servidores de preproducción configurados exactamente igual a los servidores reales, permitiendo a los usuarios probar las nuevas funciones de diagnóstico vehicular sin comprometer los datos de los clientes reales."); a2_1.setNivelCapacidadEsperado(3); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Elaborar escenarios de validación junto a los asesores de ventas, abarcando desde las funciones rutinarias del conductor hasta simulaciones de fallas extremas en la conexión celular del automóvil."); a2_2.setNivelCapacidadEsperado(4); a2_2.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("BAI07.03");
        pract03.setNombrePractica("Realizar pruebas de aceptación y autorizar la producción");
        pract03.setDescripcionPractica("Ejecutar las validaciones planificadas y obtener la firma formal de conformidad por parte de la alta dirección antes de activar la tecnología para el público general.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Coordinar sesiones presenciales donde los gerentes comerciales operen el nuevo sistema automotriz, registrando formalmente cualquier discrepancia frente al diseño original propuesto."); a3_1.setNivelCapacidadEsperado(3); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Exigir la firma de un acta de aceptación definitiva por parte de las unidades de negocio operativas, transfiriendo así la responsabilidad de la idoneidad comercial desde el departamento de ingeniería hacia la gerencia general."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        bai07.setComponenteA_Procesos(Arrays.asList(compA));

        // ==========================================
        // COMPONENTE B: ESTRUCTURAS ORGANIZATIVAS
        // ==========================================
        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(bai07); raci1.setPracticaGestion("BAI07.01"); raci1.setRolOrganizacional("Gestor Principal de Despliegue y Transición"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(bai07); raci2.setPracticaGestion("BAI07.02"); raci2.setRolOrganizacional("Directores de Unidades Comerciales"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(bai07); raci3.setPracticaGestion("BAI07.03"); raci3.setRolOrganizacional("Comité Ejecutivo de Operaciones"); raci3.setNivelResponsabilidad("C");

        bai07.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        // ==========================================
        // COMPONENTE C: FLUJOS DE INFORMACIÓN
        // ==========================================
        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(bai07); flujo1.setPracticaGestion("BAI07.01"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: BAI06.03"); flujo1.setDescripcion("Autorizaciones oficiales del comité de cambios y programación de fechas operativas.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(bai07); flujo2.setPracticaGestion("BAI07.03"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: DSS01.01"); flujo2.setDescripcion("Actas de aceptación comercial debidamente firmadas y traspaso formal de la responsabilidad operativa hacia las áreas de soporte continuo.");

        bai07.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        // ==========================================
        // COMPONENTE D: HABILIDADES PROFESIONALES
        // ==========================================
        Habilidad hab1 = new Habilidad(); hab1.setProceso(bai07); hab1.setNombreHabilidad("Evaluación de Calidad y Gestión de Pruebas Empresariales"); hab1.setDocumentacionRelacionada("Directrices del Comité Internacional de Calificación de Pruebas de Software"); hab1.setReferenciaEspecifica("De este estándar global se rescata de manera directa la metodología para diseñar escenarios de prueba objetivos que eliminen los sesgos técnicos, garantizando que el sistema sea evaluado bajo condiciones que replican con exactitud el comportamiento impredecible del consumidor real.");

        bai07.setComponenteD_Habilidades(Arrays.asList(hab1));

        // ==========================================
        // COMPONENTE E: POLÍTICAS INSTITUCIONALES
        // ==========================================
        Politica pol1 = new Politica(); pol1.setProceso(bai07); pol1.setTituloPolitica("Directiva General de Aceptación Comercial y Corresponsabilidad Operativa"); pol1.setDescripcionPolitica("Normativa institucional irrevocable que prohíbe terminantemente la transferencia de cualquier sistema tecnológico hacia el entorno público sin contar con un acta de conformidad firmada por el director comercial afectado. Esta política anula cualquier presión gerencial por cumplir fechas de lanzamiento si el producto no ha demostrado solvencia operativa en los entornos de simulación."); pol1.setDocumentacionRelacionada("Estatuto de Gobernanza Tecnológica Corporativa"); pol1.setReferenciaEspecifica("Sección: Criterios Finales de Integración Comercial");

        bai07.setComponenteE_Politicas(Arrays.asList(pol1));

        // ==========================================
        // COMPONENTE F: CULTURA DE TRABAJO
        // ==========================================
        Cultura cult1 = new Cultura(); cult1.setProceso(bai07); cult1.setElementoCultural("Cultura de Corresponsabilidad y Verificación Exhaustiva"); cult1.setDocumentacionRelacionada("Manifiesto de Integridad Organizacional"); cult1.setReferenciaEspecifica("Consolidar en la mente directiva el principio de que los errores descubiertos durante la fase de aceptación son victorias preventivas de la empresa y no fracasos del equipo técnico, fomentando un ambiente donde reportar defectos antes del despliegue comercial sea celebrado y recompensado institucionalmente.");

        bai07.setComponenteF_Cultura(Arrays.asList(cult1));

        // ==========================================
        // COMPONENTE G: SERVICIOS Y HERRAMIENTAS
        // ==========================================
        Servicio serv1 = new Servicio(); serv1.setProceso(bai07); serv1.setNombreServicioHerramienta("Entornos Informáticos de Preproducción Segregados y Simuladores de Conducta de Usuario");
        Servicio serv2 = new Servicio(); serv2.setProceso(bai07); serv2.setNombreServicioHerramienta("Plataformas Digitales para la Trazabilidad y Gestión Centralizada de Defectos Reportados");

        bai07.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(bai07);
    }
}