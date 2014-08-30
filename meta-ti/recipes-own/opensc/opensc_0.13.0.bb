DESCRIPTION = "opensc"
HOMEPAGE = "https://github.com/OpenSC/OpenSC/wiki"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=7fbc338309ac38fefcd64b04bb903e34"
DEPENDS = "openssl pcsc-lite"

SRC_URI = "http://sourceforge.net/projects/opensc/files/OpenSC/opensc-0.13.0/opensc-0.13.0.tar.gz"

SRC_URI[md5sum] = "74a10de6c646bdaae307d6dc9e9accc0"
SRC_URI[sha256sum] = "abde46ae53b12b3273e40c532ffd4f7d423a51e0919a5234761453c17c089b14"

S = "${WORKDIR}/opensc-${PV}"

inherit autotools pkgconfig

EXTRA_OECONF = " --enable-pcsc=yes "


FILES_${PN}-dev += "${libdir}/pkcs11-spy.so \
               	    ${libdir}/opensc-pkcs11.so \
                    ${libdir}/pkcs11/pkcs11-spy.so \
                    ${libdir}/pkcs11/opensc-pkcs11.so \
		    ${includedir}/pkcs11 \
                   "


FILES_${PN}-dbg += "${libdir}/pkcs11/.debug"



