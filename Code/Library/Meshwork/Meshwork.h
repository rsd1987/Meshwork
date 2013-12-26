/**
 * This file is part of the Meshwork project.
 *
 * Copyright (C) 2013, Sinisha Djukic
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General
 * Public License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place, Suite 330,
 * Boston, MA  02111-1307  USA
 */
#ifndef __MESHWORK_MESHWORK_H__
#define __MESHWORK_MESHWORK_H__

//dummy file required to force Arduino IDE include
//Meshwork library dir in the project compilation path

# define TRACE_ARRAY_BYTES(array, len)							\
  do {									\
	trace.print((const void*) array, len, IOStream::hex, len+1); \
	trace << PSTR(" "); \
  } while (0)
  
  
# define TRACE_ARRAY(msg, array, len)							\
  do {									\
    trace.print_P(msg);					\
    TRACE_ARRAY_BYTES(array, len); \
	trace << PSTR("\n"); \
  } while (0)

#define	TRACE_VP_BYTES(msg, msgvp) \
	{ \
      trace.print_P(msg);					\
	  for (const iovec_t* vp = msgvp; vp->buf != 0; vp++) \
		TRACE_ARRAY_BYTES((const void*)vp->buf, (uint8_t) vp->size); \
	  trace << PSTR("\n"); \
	}
	
#endif