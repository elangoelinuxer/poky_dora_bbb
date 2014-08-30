DESCRIPTION = "pcsc-lite"
HOMEPAGE = "pcsclite.alioth.debian.org"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://COPYING;md5=a39d325b7d9cf2f07826a5154b16500c"
DEPENDS = "udev"
RDEPENDS_${PN} += "ccid"

SRC_URI = "http://pkgs.fedoraproject.org/repo/pkgs/pcsc-lite/pcsc-lite-1.8.8.tar.bz2/069dc875a2ae2d85a2ebceac73252c0a/pcsc-lite-1.8.8.tar.bz2"
SRC_URI += "file://pcsc-lite-headerfix.patch"

SRC_URI[md5sum] = "069dc875a2ae2d85a2ebceac73252c0a"
SRC_URI[sha256sum] = "fe66354a7e738d3ef8b4e572c7e447b85894da9262381fbf004e8abcc12885e7"

S = "${WORKDIR}/pcsc-lite-${PV}"

inherit autotools

EXTRA_OECONF = " \
		--disable-libusb \
		--enable-libudev \
		--enable-usbdropdir=${libdir}/pcsc/drivers \
		"	

PACKAGES =+ "${PN}-lib"

#FILES_${PN}-lib = "${libdir}/lib*"
#FILES_${PN}-lib = "${libdir}/lib*${SOLIBS}"

