DESCRIPTION = "ccid"
HOMEPAGE = "pcsclite.alioth.debian.org"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=2d5025d4aa3495befef8f17206a5b0a1"
DEPENDS = "virtual/libusb0 pcsc-lite"

SRC_URI = "http://pkgs.fedoraproject.org/repo/pkgs/pcsc-lite-ccid/ccid-1.4.10.tar.bz2/5372e8593624dee837269bf86e4b8b06/ccid-1.4.10.tar.bz2"
SRC_URI += "file://smsc.patch"
SRC_URI += "file://gemalto.patch"
SRC_URI += "file://nfc.patch"

SRC_URI[md5sum] = "5372e8593624dee837269bf86e4b8b06"
SRC_URI[sha256sum] = "3e963ac159dc7ecbe091a1a5d40f0baa81ee07ccd747527596dbc751b76bf7a1"

S = "${WORKDIR}/ccid-${PV}"

inherit autotools 

FILES_${PN} = "${libdir}/pcsc"
FILES_${PN}-dbg += "${libdir}/pcsc/drivers/*/*/*/.debug"


