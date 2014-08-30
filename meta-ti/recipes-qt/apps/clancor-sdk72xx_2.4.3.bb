DESCRIPTION = "SDK for qt application"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENCE;md5=bf61993dd00aa1c779bd37dab972f9a1"
PR = "r1"
DEPENDS = "qt4-embedded"

FETCHCMD_wget = "/usr/bin/env wget -t 2 -T 30 -nv --passive-ftp --no-check-certificate --user=demo --password='demo'"

SRC_URI = "ftp://122.165.224.226/downloads/clancor-sdk_${PV}.tar.gz"

SRC_URI[md5sum] = "90d0772ce641150c5c3f1548601e1584"
SRC_URI[sha256sum] = "4414602bf271d6e660a5090a5b141a29f6e84b7ac55ccf0ca1ba2a5d3aa4f63b"

S = "${WORKDIR}/clancor-sdk_${PV}"

PACKAGES = "${PN}-dev ${PN}-dbg ${PN}"

inherit qt4e pkgconfig

FILES_${PN}-dbg = " \
	/opt/sdk72xx/bin/.debug/ClanCor_HHC  \
"

FILES_${PN} = " \
  /opt \
  /opt/sdk72xx \
  /opt/sdk72xx/bin \
  /opt/sdk72xx/resources \
  /opt/sdk72xx/bin/ClanCor_HHC \
  /opt/sdk72xx/resources/sdk.sh \
  ${libdir}/lib* \
"

do_install() {
	install -d ${D}/opt/
	install -d ${D}/opt/sdk72xx
	install -d ${D}/opt/sdk72xx/bin
	install -d ${D}/opt/sdk72xx/resources
	install -d ${D}/usr
	install -d ${D}/usr/lib
	install -m 0755 ${WORKDIR}/clancor-sdk_${PV}/bin/ClanCor_HHC  ${D}/opt/sdk72xx/bin/
	install -m 0755 ${WORKDIR}/clancor-sdk_${PV}/resources/sdk.sh ${D}/opt/sdk72xx/resources
	install -m 0755 ${WORKDIR}/clancor-sdk_${PV}/lib/libHHC81xx.so.1.0.0 ${D}/${libdir}
 	ln -sf ${D}/${libdir}/libHHC81xx.so.1.0.0 ${D}/${libdir}/libHHC81xx.so
 	ln -sf ${D}/${libdir}/libHHC81xx.so.1.0.0 ${D}/${libdir}/libHHC81xx.so.1
 	ln -sf ${D}/${libdir}/libHHC81xx.so.1.0.0 ${D}/${libdir}/libHHC81xx.so.1.0
}
