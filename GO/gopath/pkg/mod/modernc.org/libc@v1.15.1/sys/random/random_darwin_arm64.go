// Code generated by 'ccgo sys/random/gen.c -crt-import-path "" -export-defines "" -export-enums "" -export-externs X -export-fields F -export-structs "" -export-typedefs "" -header -hide _OSSwapInt16,_OSSwapInt32,_OSSwapInt64 -o sys/random/random_darwin_arm64.go -pkgname random', DO NOT EDIT.

package random

import (
	"math"
	"reflect"
	"sync/atomic"
	"unsafe"
)

var _ = math.Pi
var _ reflect.Kind
var _ atomic.Value
var _ unsafe.Pointer

const (
	MAC_OS_VERSION_11_0                    = 110000
	MAC_OS_VERSION_12_0                    = 120000
	MAC_OS_X_VERSION_10_0                  = 1000
	MAC_OS_X_VERSION_10_1                  = 1010
	MAC_OS_X_VERSION_10_10                 = 101000
	MAC_OS_X_VERSION_10_10_2               = 101002
	MAC_OS_X_VERSION_10_10_3               = 101003
	MAC_OS_X_VERSION_10_11                 = 101100
	MAC_OS_X_VERSION_10_11_2               = 101102
	MAC_OS_X_VERSION_10_11_3               = 101103
	MAC_OS_X_VERSION_10_11_4               = 101104
	MAC_OS_X_VERSION_10_12                 = 101200
	MAC_OS_X_VERSION_10_12_1               = 101201
	MAC_OS_X_VERSION_10_12_2               = 101202
	MAC_OS_X_VERSION_10_12_4               = 101204
	MAC_OS_X_VERSION_10_13                 = 101300
	MAC_OS_X_VERSION_10_13_1               = 101301
	MAC_OS_X_VERSION_10_13_2               = 101302
	MAC_OS_X_VERSION_10_13_4               = 101304
	MAC_OS_X_VERSION_10_14                 = 101400
	MAC_OS_X_VERSION_10_14_1               = 101401
	MAC_OS_X_VERSION_10_14_4               = 101404
	MAC_OS_X_VERSION_10_14_6               = 101406
	MAC_OS_X_VERSION_10_15                 = 101500
	MAC_OS_X_VERSION_10_15_1               = 101501
	MAC_OS_X_VERSION_10_16                 = 101600
	MAC_OS_X_VERSION_10_2                  = 1020
	MAC_OS_X_VERSION_10_3                  = 1030
	MAC_OS_X_VERSION_10_4                  = 1040
	MAC_OS_X_VERSION_10_5                  = 1050
	MAC_OS_X_VERSION_10_6                  = 1060
	MAC_OS_X_VERSION_10_7                  = 1070
	MAC_OS_X_VERSION_10_8                  = 1080
	MAC_OS_X_VERSION_10_9                  = 1090
	X_CDEFS_H_                             = 0
	X_DARWIN_FEATURE_64_BIT_INODE          = 1
	X_DARWIN_FEATURE_ONLY_64_BIT_INODE     = 1
	X_DARWIN_FEATURE_ONLY_UNIX_CONFORMANCE = 1
	X_DARWIN_FEATURE_ONLY_VERS_1050        = 1
	X_DARWIN_FEATURE_UNIX_CONFORMANCE      = 3
	X_FILE_OFFSET_BITS                     = 64
	X_LP64                                 = 1
	X_Nonnull                              = 0
	X_Null_unspecified                     = 0
	X_Nullable                             = 0
	X_PTRDIFF_T                            = 0
	X_SIZE_T                               = 0
	X_WCHAR_T                              = 0
)

type Ptrdiff_t = int64 /* <builtin>:3:26 */

type Size_t = uint64 /* <builtin>:9:23 */

type Wchar_t = int32 /* <builtin>:15:24 */

type X__int128_t = struct {
	Flo int64
	Fhi int64
} /* <builtin>:21:43 */ // must match modernc.org/mathutil.Int128
type X__uint128_t = struct {
	Flo uint64
	Fhi uint64
} /* <builtin>:22:44 */ // must match modernc.org/mathutil.Int128

type X__builtin_va_list = uintptr /* <builtin>:46:14 */
type X__float128 = float64        /* <builtin>:47:21 */

var X__darwin_check_fd_set_overflow uintptr /* <builtin>:146:5: */

// ===---- __stddef_max_align_t.h - Definition of max_align_t for modules ---===
//
// Part of the LLVM Project, under the Apache License v2.0 with LLVM Exceptions.
// See https://llvm.org/LICENSE.txt for license information.
// SPDX-License-Identifier: Apache-2.0 WITH LLVM-exception
//
//===-----------------------------------------------------------------------===

type Max_align_t = float64 /* __stddef_max_align_t.h:16:21 */

var _ int8 /* gen.c:2:13: */