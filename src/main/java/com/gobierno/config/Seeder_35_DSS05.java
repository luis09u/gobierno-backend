package com.gobierno.config;

import com.gobierno.model.*;
import com.gobierno.repository.ProcesoCobitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;

@Component
@Order(35)
public class Seeder_35_DSS05 implements CommandLineRunner {

    private final ProcesoCobitRepository procesoRepository;

    public Seeder_35_DSS05(ProcesoCobitRepository procesoRepository) {
        this.procesoRepository = procesoRepository;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        if (!procesoRepository.existsById("DSS05")) {
            cargarDSS05();
        }
    }

    private void cargarDSS05() {
        ProcesoCobit dss05 = new ProcesoCobit();
        dss05.setIdProceso("DSS05");
        dss05.setDominio("Entregar, Dar Servicio y Soporte");
        dss05.setAreaPrioritaria("Modelo Core de COBIT");
        dss05.setNombreProceso("Gestionar los servicios de seguridad");
        dss05.setDescripcionProceso("Proteger la información de la empresa para mantener un nivel aceptable de riesgo de seguridad de la información de acuerdo con la política de seguridad. Establecer y mantener roles y privilegios de acceso a la información y el control del acceso al sistema.");
        dss05.setPropositoProceso("Bloquear cualquier intento de infiltración hacia los servidores centrales o hacia los sistemas telemáticos a bordo de los vehículos conectados, garantizando que los datos personales de los clientes y los secretos industriales de la marca permanezcan absolutamente resguardados bajo cualquier circunstancia operativa.");

        dss05.setMetasAlineamiento("AG07: Seguridad de la información, infraestructura de procesamiento y de las aplicaciones.\nAG11: Cumplimiento de las políticas internas de I&T.");
        dss05.setMetasEmpresariales("EG03: Cumplimiento de leyes y regulaciones externas.\nEG06: Continuidad y disponibilidad del servicio de negocio.");
        dss05.setMetricasModelo("Métrica 1: Número de incidentes de seguridad que causan disrupción en el negocio o coste económico.\nMétrica 2: Número de cuentas activas de empleados, usuarios o sistemas inactivos.");

        ComponenteProceso compA = new ComponenteProceso();
        compA.setProceso(dss05);
        compA.setTipoComponente("A");
        compA.setNombreComponente("Procesos");

        PracticaCobit pract01 = new PracticaCobit();
        pract01.setComponente(compA);
        pract01.setIdPractica("DSS05.01");
        pract01.setNombrePractica("Proteger contra código malicioso");
        pract01.setDescripcionPractica("Implementar y mantener medidas preventivas, detectivas y correctivas en toda la empresa, en particular concientizando sobre la seguridad de forma actualizada, para proteger los sistemas de información y las tecnologías frente a la amenaza de códigos maliciosos.");
        Actividad a1_1 = new Actividad(); a1_1.setPractica(pract01); a1_1.setDescripcionActividad("Implementar y configurar herramientas de protección contra códigos maliciosos en todos los componentes de la infraestructura."); a1_1.setNivelCapacidadEsperado(2); a1_1.setCalificacionActual("N");
        Actividad a1_2 = new Actividad(); a1_2.setPractica(pract01); a1_2.setDescripcionActividad("Mantener el software de protección contra códigos maliciosos actualizado de forma automática y continua."); a1_2.setNivelCapacidadEsperado(3); a1_2.setCalificacionActual("N");
        Actividad a1_3 = new Actividad(); a1_3.setPractica(pract01); a1_3.setDescripcionActividad("Llevar a cabo revisiones periódicas o análisis del entorno para detectar códigos maliciosos."); a1_3.setNivelCapacidadEsperado(3); a1_3.setCalificacionActual("N");
        pract01.setActividades(Arrays.asList(a1_1, a1_2, a1_3));

        PracticaCobit pract02 = new PracticaCobit();
        pract02.setComponente(compA);
        pract02.setIdPractica("DSS05.02");
        pract02.setNombrePractica("Gestionar la seguridad de la red y las conexiones");
        pract02.setDescripcionPractica("Implementar medidas de seguridad y los procedimientos de control relacionados en todas las áreas y operaciones de la red y de las comunicaciones de la empresa para proteger la información y mitigar los riesgos derivados del flujo de datos.");
        Actividad a2_1 = new Actividad(); a2_1.setPractica(pract02); a2_1.setDescripcionActividad("Implementar y mantener firewalls, sistemas de detección/prevención de intrusiones y mecanismos de control de acceso a la red."); a2_1.setNivelCapacidadEsperado(2); a2_1.setCalificacionActual("N");
        Actividad a2_2 = new Actividad(); a2_2.setPractica(pract02); a2_2.setDescripcionActividad("Aplicar cifrado en la transmisión de datos confidenciales y sensibles en la red."); a2_2.setNivelCapacidadEsperado(3); a2_2.setCalificacionActual("N");
        Actividad a2_3 = new Actividad(); a2_3.setPractica(pract02); a2_3.setDescripcionActividad("Auditar periódicamente la configuración de los dispositivos de red (firewalls, routers) para garantizar el cumplimiento de las políticas."); a2_3.setNivelCapacidadEsperado(4); a2_3.setCalificacionActual("N");
        pract02.setActividades(Arrays.asList(a2_1, a2_2, a2_3));

        PracticaCobit pract03 = new PracticaCobit();
        pract03.setComponente(compA);
        pract03.setIdPractica("DSS05.04");
        pract03.setNombrePractica("Gestionar la identidad y el acceso de los usuarios");
        pract03.setDescripcionPractica("Garantizar que todos los usuarios dispongan de derechos de acceso a la información de conformidad con los requisitos del negocio y coordinar esos derechos con la gestión de identidad, controlando los procesos y acciones relativos al aprovisionamiento.");
        Actividad a3_1 = new Actividad(); a3_1.setPractica(pract03); a3_1.setDescripcionActividad("Mantener un registro de todos los usuarios de la I&T corporativa con sus respectivos derechos de acceso."); a3_1.setNivelCapacidadEsperado(2); a3_1.setCalificacionActual("N");
        Actividad a3_2 = new Actividad(); a3_2.setPractica(pract03); a3_2.setDescripcionActividad("Implementar un proceso formal para el otorgamiento y revocación oportuna de los privilegios de acceso."); a3_2.setNivelCapacidadEsperado(3); a3_2.setCalificacionActual("N");
        Actividad a3_3 = new Actividad(); a3_3.setPractica(pract03); a3_3.setDescripcionActividad("Realizar revisiones y certificaciones periódicas (al menos anualmente) de las cuentas y derechos de acceso de los usuarios."); a3_3.setNivelCapacidadEsperado(4); a3_3.setCalificacionActual("N");
        pract03.setActividades(Arrays.asList(a3_1, a3_2, a3_3));

        compA.setPracticas(Arrays.asList(pract01, pract02, pract03));
        dss05.setComponenteA_Procesos(Arrays.asList(compA));

        MatrizRaci raci1 = new MatrizRaci(); raci1.setProceso(dss05); raci1.setPracticaGestion("DSS05.01"); raci1.setRolOrganizacional("Director de Seguridad de la Información Operativa"); raci1.setNivelResponsabilidad("A");
        MatrizRaci raci2 = new MatrizRaci(); raci2.setProceso(dss05); raci2.setPracticaGestion("DSS05.02"); raci2.setRolOrganizacional("Administradores de Redes y Perímetros de Defensa"); raci2.setNivelResponsabilidad("R");
        MatrizRaci raci3 = new MatrizRaci(); raci3.setProceso(dss05); raci3.setPracticaGestion("DSS05.04"); raci3.setRolOrganizacional("Gestor Institucional de Identidades y Accesos"); raci3.setNivelResponsabilidad("R");
        dss05.setComponenteB_Raci(Arrays.asList(raci1, raci2, raci3));

        FlujoInformacion flujo1 = new FlujoInformacion(); flujo1.setProceso(dss05); flujo1.setPracticaGestion("DSS05.02"); flujo1.setTipoFlujo("ENTRADA"); flujo1.setOrigenDestino("DE: APO13.01"); flujo1.setDescripcion("Políticas maestras de seguridad de la información y arquitecturas de defensa corporativa aprobadas por la directiva.");
        FlujoInformacion flujo2 = new FlujoInformacion(); flujo2.setProceso(dss05); flujo2.setPracticaGestion("DSS05.04"); flujo2.setTipoFlujo("SALIDA"); flujo2.setOrigenDestino("A: MEA02.01"); flujo2.setDescripcion("Registros de auditoría sobre los accesos bloqueados y alertas generadas por intentos de autenticación fraudulenta.");
        dss05.setComponenteC_Flujos(Arrays.asList(flujo1, flujo2));

        Habilidad hab1 = new Habilidad(); hab1.setProceso(dss05); hab1.setNombreHabilidad("Defensa Cibernética y Criptografía Aplicada a Redes Complejas"); hab1.setDocumentacionRelacionada("Estándar Internacional de Seguridad de la Información ISO 27001 dictado por la Organización Internacional de Normalización"); hab1.setReferenciaEspecifica("De esta normativa mundial se rescata detalladamente el modelo de mejora continua para la gestión de controles criptográficos, permitiendo estructurar defensas perimetrales sólidas que evolucionan al mismo ritmo que las amenazas externas.");
        dss05.setComponenteD_Habilidades(Arrays.asList(hab1));

        Politica pol1 = new Politica(); pol1.setProceso(dss05); pol1.setTituloPolitica("Directiva de Confianza Cero y Revocación Inmediata de Credenciales"); pol1.setDescripcionPolitica("Normativa institucional irrevocable que prohíbe el uso de cuentas de acceso genéricas o compartidas dentro de la organización. Asimismo, esta política dictamina que las credenciales de cualquier empleado desvinculado deben ser desactivadas en un plazo máximo de quince minutos desde el momento de la notificación administrativa."); pol1.setDocumentacionRelacionada("Estatuto Corporativo de Control de Accesos"); pol1.setReferenciaEspecifica("Sección: Autenticación Individual y Remoción de Privilegios");
        dss05.setComponenteE_Politicas(Arrays.asList(pol1));

        Cultura cult1 = new Cultura(); cult1.setProceso(dss05); cult1.setElementoCultural("Cultura de Desconfianza Preventiva y Responsabilidad Compartida"); cult1.setDocumentacionRelacionada("Código de Integridad Tecnológica"); cult1.setReferenciaEspecifica("Fomentar en todos los colaboradores la premisa de que todo enlace o correo electrónico inusual representa una amenaza potencial para la empresa, educando al personal para que comprenda que la seguridad informática no es responsabilidad exclusiva del departamento técnico, sino un deber de cada empleado.");
        dss05.setComponenteF_Cultura(Arrays.asList(cult1));

        Servicio serv1 = new Servicio(); serv1.setProceso(dss05); serv1.setNombreServicioHerramienta("Plataformas de Prevención de Intrusiones y Cortafuegos Corporativos de Análisis Profundo");
        Servicio serv2 = new Servicio(); serv2.setProceso(dss05); serv2.setNombreServicioHerramienta("Sistemas de Gestión de Identidades y Plataformas de Autenticación de Múltiples Factores");
        dss05.setComponenteG_Servicios(Arrays.asList(serv1, serv2));

        procesoRepository.save(dss05);
    }
}