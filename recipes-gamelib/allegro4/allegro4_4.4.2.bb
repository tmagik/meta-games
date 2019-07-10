DESCRIPTION = "Allegro4 is cross-platform, open source, game programming library"
HOMEPAGE = "https://liballeg.org/"
SECTION = "libs"

LICENSE = "Allegro4"
LIC_FILES_CHKSUM = "file://docs/txt/license.txt;md5=55ec083de776f786d0da79bbbb887c50"

DEPENDS = "virtual/libgl libglu libx11 libxcursor physfs openal-soft jpeg"

# This uses uploaded asset from github.com, not one automatically regenerated
# from time to time
SRC_URI = "https://github.com/liballeg/allegro5/releases/download/${PV}/allegro-${PV}.tar.gz \
           file://avoid_lib_paths.patch \
           file://0001-CMakeLists.txt-don-t-try-to-run-in-cross-environment.patch \
"

SRC_URI[md5sum] = "4db71b0460fc99926ae91d223199c2e6"
SRC_URI[sha256sum] = "1b21e7577dbfada02d85ca4510bd22fedaa6ce76fde7f4838c7c1276eb840fdc"

inherit cmake binconfig

S = "${WORKDIR}/allegro-${PV}"

FILES_${PN} += "${libdir}/allegro"
FILES_${PN}-dbg += "${libdir}/allegro/*/.debug"
